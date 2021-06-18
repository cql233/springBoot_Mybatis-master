package ExcelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import bean.Fenxi;
import bean.ShouKuan;

/**
 * 〈处理特殊excel的工具〉
 *
 * @author cql
 * @create 2021/3/9
 * @since 1.0.0
 */
public class ExcelUtil {
    @Test
    public void TestCreateExcel()throws  IOException{
        String path ="F:\\TestCsvDirectory\\查询凭证列表-收款.xlsx";
        List<ShouKuan> ShouKuanList=new ArrayList<>();
        ShouKuanList=getShouKuangExcel(path);
        String path2 ="F:\\TestCsvDirectory\\查询凭证列表-账单.xlsx";
        List<ShouKuan> ZhangdanList=new ArrayList<>();
        ZhangdanList=getShouKuangExcel(path2);
        String path3 ="F:\\TestCsvDirectory\\分析.xlsx";
        List<Fenxi> FenxiList=new ArrayList<>();
        FenxiList=getFenxiExcel(path3);
        //将账单金额填入分析表
       getZhangdanAmount(ZhangdanList,FenxiList);
       //将收款金额填入分析表
        getShouKuanAmount(ShouKuanList,FenxiList);
        //计算余额
        getResultAmout(FenxiList);
       //入力excel的内容
        writeExcel(FenxiList,path3);
    }
    public void getResultAmout(List<Fenxi> list){
        Fenxi fenxi;
        for(int i=0;i<list.size();i++){
            fenxi=list.get(i);
            //如果账单有金额       账单-收款
            //如果账单没有金额  数据-收款
            if(!(fenxi.getZhangDanAmount()==null)){
                if(  !(null==fenxi.getShouKuanAmount())){
                    fenxi.setResutlAmout(fenxi.getZhangDanAmount().subtract(fenxi.getShouKuanAmount()));
                }else{
                    fenxi.setResutlAmout(fenxi.getZhangDanAmount());
                }

            }else {
                if(  !(null==fenxi.getShouKuanAmount())){
                    fenxi.setResutlAmout(fenxi.getDataAmount().subtract(fenxi.getShouKuanAmount()));
                }else
                    fenxi.setResutlAmout(fenxi.getDataAmount());
            }
//            fenxi.setResutlAmout(fenxi.getResutlAmout().setScale(1,BigDecimal.ROUND_UP));
        }
    }
    public void getShouKuanAmount(List<ShouKuan> shouKuans,List<Fenxi> list){
        for(int i=0;i<list.size();i++){
            Fenxi fenxi=list.get(i);
            for(int j=0;j<shouKuans.size();j++){
                ShouKuan shouKuan=shouKuans.get(j);
                if(shouKuan.getInfo().contains(fenxi.getName())){
                    //todo 时间筛选
                    String[] temp=shouKuan.getInfo().split("\\.");
                    String[] times=temp[1].trim().split("\\-");
                    for(int k=0;k<times.length;k++){
                        //去掉05 前面的0
                       String time= String.valueOf(Integer.valueOf(times[k]))+"月";
                        if(fenxi.getTime().equals(time)){
                            if(shouKuan.getAmount()==null){
                                fenxi.setShouKuanAmount(null);
                            }else if(shouKuan.getAmount().compareTo(fenxi.getZhangDanAmount())>0){
                                //收款>账单
                                fenxi.setShouKuanAmount(fenxi.getZhangDanAmount());
                                //得到余钱
                                shouKuan.setAmount(shouKuan.getAmount().subtract(fenxi.getZhangDanAmount()));
                            }else if(shouKuan.getAmount().compareTo(fenxi.getZhangDanAmount())<=0){
                                //收款<账单
                                fenxi.setShouKuanAmount(shouKuan.getAmount());
                                shouKuan.setAmount(BigDecimal.ZERO);
                            }
                        }else{
                            continue;
                        }
                    }

                }else{
                    continue;
                }
            }
        }
    }
    public void paixu(List<T> list){
        //todo  暂时不需要
    }
    public void getZhangdanAmount(List<ShouKuan> zhangdans,List<Fenxi> list){
        for(int i=0;i<list.size();i++){
            Fenxi fenxi=list.get(i);
            for(int j=0;j<zhangdans.size();j++){
                ShouKuan zhangDan=zhangdans.get(j);
                String time="收到"+fenxi.getTime();
                if(zhangDan.getInfo().contains(time)&&zhangDan.getInfo().contains(fenxi.getName())){
                    fenxi.setZhangDanAmount(zhangDan.getAmount());
                    break;
                }else{
                    continue;
                }
            }
        }
    }
    public void writeExcel(List<Fenxi> list,String path){
        OutputStream out = null;
        try {
            File file = new File(path);
            FileInputStream in = new FileInputStream(file);
            XSSFWorkbook wb  = new XSSFWorkbook(in);

            XSSFSheet sheet= wb.getSheetAt(0);
            XSSFRow row;
            //todo
            for(int i=0;i<list.size();i++){
                Fenxi fenxi=list.get(i);
                row=sheet.getRow(i+1);
                XSSFCell cell0=row.getCell(4);
                XSSFCell cell1=row.getCell(5);
                XSSFCell cell2=row.getCell(6);
                //todo
                if(!(null==fenxi.getZhangDanAmount()))
                cell0.setCellValue(fenxi.getZhangDanAmount().toString());
                if(!(null==fenxi.getShouKuanAmount()))
                cell1.setCellValue(fenxi.getShouKuanAmount().toString());
                if(!(null==fenxi.getResutlAmout()))
                cell2.setCellValue(fenxi.getResutlAmout().toString());
            }
            out =  new FileOutputStream(path);
            wb.write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(out != null){
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    获取收款
     */
    public List<ShouKuan> getShouKuangExcel(String path)throws IOException {
        XSSFWorkbook workbook = null;
        // 获取模板路径
        workbook = new XSSFWorkbook(new FileInputStream(new File(path)));
        XSSFSheet sheet =workbook.getSheetAt(0);

        List<ShouKuan> list=new ArrayList<>();
        boolean flag=false;
        //创建行  从0行 0列开始计数
        for(int i=4;i<=sheet.getLastRowNum()-3;i++){
            flag=false;
            Cell infoCell=sheet.getRow(i).getCell(2);
            Cell amountCell=sheet.getRow(i).getCell(3);
            ShouKuan shouKuan=new ShouKuan(getCellFormatValue(infoCell),
                    new BigDecimal(getCellFormatValue(amountCell)));
            if(path.contains("收款")){
                for(int m=0;m<list.size();m++){
                    if(isEqual(shouKuan,list.get(m))){
                    list.get(m).setAmount(
                            shouKuan.getAmount().add(list.get(m).getAmount()) );
                    flag=true;
                    break;
                    }
                }
            }
            if(flag){
                continue;
            }
            list.add(shouKuan);
        }
        return  list;
    }
    public boolean isEqual(ShouKuan a,ShouKuan b){
        if(a.getInfo().equals(b.getInfo())){
            return  true;
        }
        String[] aStrinfos=a.getInfo().split("\\.");
        if(aStrinfos.length<1){
            return false;
        }
        String temp=aStrinfos[0].split("\\-")[1].trim();
        String reuslt=temp.substring(0,temp.length()-4);
        String time=aStrinfos[1].trim();
        String[] bStrinfos=b.getInfo().split("\\.");
        String btemp=bStrinfos[0].split("\\-")[1].trim();
        String breuslt=btemp.substring(0,btemp.length()-4);
        String btime=bStrinfos[1].trim();
        if((reuslt+time).equals(breuslt+btime))
            return true;
        return false;
    }

    public List<Fenxi> getFenxiExcel(String path)throws IOException {
        XSSFWorkbook workbook = null;
        // 获取模板路径
        workbook = new XSSFWorkbook(new FileInputStream(new File(path)));
        XSSFSheet sheet =workbook.getSheetAt(0);

        List<Fenxi> list=new ArrayList<>();
        //创建行  从0行 0列开始计数
        for(int i=1;i<=sheet.getLastRowNum();i++){
            XSSFRow row= sheet.getRow(i);
            Cell cell0=row.getCell(0);
            Cell cell1=row.getCell(1);
            Cell cell2=row.getCell(2);
            Cell cell3=row.getCell(3);
            Cell cell4=row.getCell(4);
            Cell cell5=row.getCell(5);
            Cell cell6=row.getCell(6);
            BigDecimal dataAmount,zhangdanAmount,shouKuanAmount;
            if(getCellFormatValue(cell3).equals("")){
                dataAmount=null;
            }else{
                dataAmount=new BigDecimal(getCellFormatValue(cell3));
            }
            if(getCellFormatValue(cell4).equals("")){
                zhangdanAmount=null;
            }else{
                zhangdanAmount=new BigDecimal(getCellFormatValue(cell4));
            }
            if(getCellFormatValue(cell5).equals("")){
                shouKuanAmount=null;
            }else{
                shouKuanAmount=new BigDecimal(getCellFormatValue(cell4));
            }
                Fenxi fenxi=new Fenxi(getCellFormatValue(cell0),getCellFormatValue(cell1),getCellFormatValue(cell2),
                        dataAmount,
                        zhangdanAmount,
                        shouKuanAmount,null);
                list.add(fenxi);
            }

        return  list;
    }
    /**
     * 获取excel单元格的内容
     */
    public static String getCellFormatValue(Cell cell) {
        //判断是否为null或空串
        if (cell==null || cell.toString().trim().equals("")) {
            return "";
        }
        String cellValue = "";
        int cellType=cell.getCellType();
        switch (cellType) {
            case Cell.CELL_TYPE_NUMERIC: // 数字
                short format = cell.getCellStyle().getDataFormat();
                boolean  isDate=HSSFDateUtil.isCellDateFormatted(cell);
                if (DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = null;
                    //System.out.println("cell.getCellStyle().getDataFormat()="+cell.getCellStyle().getDataFormat());
                    if (format == 20 || format == 32) {
                        sdf = new SimpleDateFormat("HH:mm");
                    } else if (format == 14 || format == 31 || format == 57 || format == 58) {
                        // 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
                        sdf = new SimpleDateFormat("yyyy-MM-dd");
                        double value = cell.getNumericCellValue();
                        Date date = org.apache.poi.ss.usermodel.DateUtil
                                .getJavaDate(value);
                        cellValue = sdf.format(date);
                    }else{// 日期
                        sdf = new SimpleDateFormat("M月");
                    }
                    try {
                        cellValue = sdf.format(cell.getDateCellValue());// 日期
                    } catch (Exception e) {
                        try {
                            throw new Exception("exception on get date data !".concat(e.toString()));
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }finally{
                        sdf = null;
                    }
                }  else {
                    BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                    cellValue = bd.toPlainString();// 数值 这种用BigDecimal包装再获取plainString，可以防止获取到科学计数值
                }
                break;
            case Cell.CELL_TYPE_STRING: // 字符串
                cellValue = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_BOOLEAN: // Boolean
                cellValue = cell.getBooleanCellValue()+"";;
                break;
            case Cell.CELL_TYPE_FORMULA: // 公式
                cellValue = cell.getCellFormula();
                break;
            case Cell.CELL_TYPE_BLANK: // 空值
                cellValue = "";
                break;
            case Cell.CELL_TYPE_ERROR: // 故障
                cellValue = "ERROR VALUE";
                break;
            default:
                cellValue = "UNKNOW VALUE";
                break;
        }
        return cellValue;
    }
}