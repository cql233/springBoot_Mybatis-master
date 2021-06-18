package com.example.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.log4j.Logger;

import com.example.paytree.entity.BaseBean;


/**
 * 〈〉
 *
 * @author cql
 * @create 2020/6/28
 * @since 1.0.0
 */
public class PointsToCsvFile {
    private static final Logger LOGGER = Logger.getLogger(PointsToCsvFile.class);

    public static void PointsToCsvFile(List<BaseBean> pointsList, String path){
if (pointsList!=null && pointsList.size() > 0){

        //CSV文件路径及名称
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
//        String filePath = "F:\\TestCsvDirectory"+ File.separator+path; //CSV文件路径
    String filePath = "/opt/wpay/resource/gateway/cql"+ File.separator+path; //CSV文件路径
        String fileName = "CSV_"+pointsList.get(0).getFileType()+ File.separator+ df.format(localDateTime) +".csv";//CSV文件名称
//        String fileName = "store_"+df.format(localDateTime) +".csv";//CSV文件名称
        File csvFile = null;
        BufferedWriter csvWriter = null;
    try {
            csvFile = new File(filePath + File.separator + fileName);
            LOGGER.info(filePath + File.separator + fileName);
            File parent = csvFile.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            csvFile.createNewFile();

            // GB2312使正确读取分隔符","
            csvWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), "utf8"), 1024);

            //这部分在第一行居中展示文件名称，根据实际情况，可选择取消注释
            /*int num = headArr.length / 2;
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < num; i++) {
                buffer.append(",");
            }
            csvWriter.write(buffer.toString() + fileName + buffer.toString());
            csvWriter.newLine();*/

            // 写入文件头部标题行
            // 表格头
            csvWriter.write(String.join(",", pointsList.get(0).getHear()));
            csvWriter.newLine();
            // 写入文件内容
            for (BaseBean points : pointsList) {
                csvWriter.write(points.toRow());
                csvWriter.newLine();
            }
            csvWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
}