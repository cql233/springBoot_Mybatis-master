package com.example;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.util.DigestUtils;

/**
 * 〈生成xml文件demo〉
 *
 * @author cql
 * @create 2020/8/27
 * @since 1.0.0
 */
public class XMLFileCreate {
    public static void main(String[] args) throws IOException {
        XmlCreate();
    }
    public static void XmlCreate() throws IOException {
          Document doc= DocumentHelper.createDocument();
        //第一节点
        Element Kmt_info=doc.addElement("kmt_info");
        //第二节点
        Element version=Kmt_info.addElement("version");
        version.setText("1.1.3");
        Element acq_pattern=Kmt_info.addElement("acq_pattern");
        //todo
        String strTemp="20210421_batch";
        acq_pattern.setText("chenqinglin233");
        Element Kmt_cus_id=Kmt_info.addElement("kmt_cus_id");
        Kmt_cus_id.setText(strTemp);
        Element kmt_name_jp=Kmt_info.addElement("kmt_name_jp");
        Element kmt_close_date_1=Kmt_info.addElement("kmt_close_date_1");
        Element kmt_close_date_2=Kmt_info.addElement("kmt_close_date_2");
        Element kmt_close_date_3=Kmt_info.addElement("kmt_close_date_3");
        Element kmt_charge_date_1=Kmt_info.addElement("kmt_charge_date_1");
        Element kmt_charge_date_2=Kmt_info.addElement("kmt_charge_date_2");
        Element kmt_charge_date_3=Kmt_info.addElement("kmt_charge_date_3");
        kmt_name_jp.addCDATA((strTemp));
        kmt_close_date_1.setText("15");
        kmt_close_date_2.setText("00");
        kmt_close_date_3.setText("00");
        kmt_charge_date_1.setText("15");
        kmt_charge_date_2.setText("00");
        kmt_charge_date_3.setText("00");
        Element kmt_chargePerson_department=Kmt_info.addElement("kmt_chargePerson_department");
        kmt_chargePerson_department.addCDATA(("第一営業所"));
        Element kmt_chargePerson_name=Kmt_info.addElement("kmt_chargePerson_name");
        kmt_chargePerson_name.addCDATA(("次郎"));
        Element kmt_chargePerson_mailAddress=Kmt_info.addElement("kmt_chargePerson_mailAddress");
        String mailAD=DigestUtils.md5DigestAsHex((""+Math.random()).getBytes());
        kmt_chargePerson_mailAddress.setText(mailAD+"@126.com");
        Element kmt_chargePerson_telNumber=Kmt_info.addElement("kmt_chargePerson_telNumber");
        kmt_chargePerson_telNumber.setText("123123123");
        Element kmt_address_1=Kmt_info.addElement("kmt_address_1");
        Element kmt_address_2=Kmt_info.addElement("kmt_address_2");
        Element kmt_address_3=Kmt_info.addElement("kmt_address_3");
        Element kmt_address_4=Kmt_info.addElement("kmt_address_4");
        Element kmt_address_5=Kmt_info.addElement("kmt_address_5");
        Element kmt_address_6=Kmt_info.addElement("kmt_address_6");
        kmt_address_1.addCDATA(("大阪府"));
        kmt_address_2.addCDATA(("区豊洲"));
        kmt_address_3.addCDATA(("1-1-1"));
        kmt_address_4.setText("1231232");
        kmt_address_5.addCDATA(("第一ビル"));
        kmt_address_6.addCDATA(("００１"));

        Element kmt_pay_account_type=Kmt_info.addElement("kmt_pay_account_type");
        kmt_pay_account_type.setText("4");
        Element kmt_pay_bank=Kmt_info.addElement("kmt_pay_bank");
        kmt_pay_bank.addCDATA(("楽天銀行"));
        Element kmt_pay_bank_kana=Kmt_info.addElement("kmt_pay_bank_kana");
        Element kmt_pay_code=Kmt_info.addElement("kmt_pay_code");
        Element kmt_pay_bank_2=Kmt_info.addElement("kmt_pay_bank_2");
        Element kmt_pay_bank_2_kana=Kmt_info.addElement("kmt_pay_bank_2_kana");
        kmt_pay_bank_kana.addCDATA(("ラクテンギンコウ"));
        kmt_pay_code.addCDATA(("1231"));
        kmt_pay_bank_2.addCDATA(("本店"));
        kmt_pay_bank_2_kana.addCDATA(("ホンテン"));
        Element kmt_pay_code_2=Kmt_info.addElement("kmt_pay_code_2");
        kmt_pay_code_2.addCDATA(("102"));
        Element kmt_pay_name_kanji=Kmt_info.addElement("kmt_pay_name_kanji");
        kmt_pay_name_kanji.addCDATA(("第一号加盟店"));
        Element kmt_pay_name_kana=Kmt_info.addElement("kmt_pay_name_kana");
        kmt_pay_name_kana.addCDATA(("カナ"));
        Element kmt_pay_remitter_code=Kmt_info.addElement("kmt_pay_remitter_code");
        kmt_pay_remitter_code.setText("102");
        Element kmt_pay_account=Kmt_info.addElement("kmt_pay_account");
        Element kmt_print_1=Kmt_info.addElement("kmt_print_1");
        Element kmt_print_2=Kmt_info.addElement("kmt_print_2");
        Element kmt_print_3=Kmt_info.addElement("kmt_print_3");
        Element kmt_print_4=Kmt_info.addElement("kmt_print_4");
        kmt_pay_account.setText(("1232322"));
        kmt_print_1.setText("0");
        kmt_print_2.setText("0");
        kmt_print_3.setText("1");
        kmt_print_4.setText("1");
        Element kmt_payment=Kmt_info.addElement("kmt_payment");
        kmt_payment.setText("");
        Element kmt_comment_jp=Kmt_info.addElement("kmt_comment_jp");
        kmt_comment_jp.setText("");
        Element kmt_status=Kmt_info.addElement("kmt_status");
        // 申請対象「0」、利用中止「9」、再利用「8」
        kmt_status.setText("0");
        Element kmt_merchant_type=Kmt_info.addElement("kmt_merchant_type");
        //法人「01」、個人「02」
        kmt_merchant_type.setText("02");
        Element kmt_registration_no=Kmt_info.addElement("kmt_registration_no");
        kmt_registration_no.addCDATA(("22233"));
        Element kmt_area_code=Kmt_info.addElement("kmt_area_code");
        kmt_area_code.setText("JP");
        Element kmt_create_user=Kmt_info.addElement("kmt_create_user");
        kmt_create_user.setText("");
        Element kmt_create_date=Kmt_info.addElement("kmt_create_date");
        kmt_create_date.setText("");
        Element kmt_modify_user=Kmt_info.addElement("kmt_modify_user");
        kmt_modify_user.setText( "");
        Element kmt_modify_date=Kmt_info.addElement("kmt_modify_date");
        kmt_modify_date.setText("");
        Element kmt_shops_info=Kmt_info.addElement("kmt_shops_info");
        //todo  循环的地点
        int index;
        for(index=1;index<=1;index++){
            //第三节点
            Element shop_info=kmt_shops_info.addElement("shop_info");
            //第四节点
            Element shop_cus_id=shop_info.addElement("shop_cus_id");
            shop_cus_id.setText("20210309_dp_"+(index));
            Element shop_name_jp=shop_info.addElement("shop_name_jp");
            //todo
            shop_name_jp.addCDATA((""+DigestUtils.md5DigestAsHex((""+index).getBytes()).substring(1,9)+""));
            Element shop_name_kana=shop_info.addElement("shop_name_kana");
            shop_name_kana.addCDATA("ギンザイチゴウテン");
            Element shop_mcc_code=shop_info.addElement("shop_mcc_code");
            shop_mcc_code.setText("5944");
            Element shop_busi_description=shop_info.addElement("shop_busi_description");
            shop_busi_description.addCDATA(("経営"));
            Element shop_chargeperson_telNumber=shop_info.addElement("shop_chargeperson_telNumber");
            shop_chargeperson_telNumber.setText("1231232222");
            Element shop_address_1=shop_info.addElement("shop_address_1");
            shop_address_1.addCDATA("千葉県");
            Element shop_address_2=shop_info.addElement("shop_address_2");
            shop_address_2.addCDATA("中央区銀座");
            Element shop_address_3=shop_info.addElement("shop_address_3");
            shop_address_3.addCDATA(("2-1-2"));
            Element shop_address_4=shop_info.addElement("shop_address_4");
            shop_address_4.setText("1232322");
            Element shop_address_5=shop_info.addElement("shop_address_5");
            Element shop_address_6=shop_info.addElement("shop_address_6");
            shop_address_5.addCDATA("銀座一号店ビル");
            shop_address_6.addCDATA(("１"));
            Element shop_print_1=shop_info.addElement("shop_print_1");
            shop_print_1.setText("1");
            Element shop_print_2=shop_info.addElement("shop_print_2");
            shop_print_2.setText("1");
            Element shop_print_3=shop_info.addElement("shop_print_3");
            shop_print_3.setText("1");
            Element shop_print_4=shop_info.addElement("shop_print_4");
            shop_print_4.setText("1");
            Element shop_status=shop_info.addElement("shop_status");
            shop_status.setText("0");
            Element shop_create_user=shop_info.addElement("shop_create_user");
            shop_create_user.setText("");
            Element shop_create_date=shop_info.addElement("shop_create_date");
            shop_create_date.setText("");
            Element shop_modify_user=shop_info.addElement("shop_modify_user");
            shop_modify_user.setText("");
            Element shop_modify_date=shop_info.addElement("shop_modify_date");
            shop_modify_date.setText("");
            Element kmt_shop_clients_info=shop_info.addElement("kmt_shop_clients_info");
            //子节点
            Element shop_client=kmt_shop_clients_info.addElement("shop_client");
            //子节点
            Element shop_client_cus_id=shop_client.addElement("shop_client_cus_id");
            shop_client_cus_id.setText("cql_terminal_"+(index));
            Element shop_client_type=shop_client.addElement("shop_client_type");
            shop_client_type.setText("01");
            Element shop_client_other=shop_client.addElement("shop_client_other");
            shop_client_other.addCDATA((""));
            Element shop_client_productkey=shop_client.addElement("shop_client_productkey");
            shop_client_productkey.setText("");
            Element shop_client_cpay_output_datetime=shop_client.addElement("shop_client_cpay_output_datetime");
            shop_client_cpay_output_datetime.setText("");
            Element shop_client_status=shop_client.addElement("shop_client_status");
            //端末種別シート
            shop_client_status.setText("0");
            Element shop_client_create_user=shop_client.addElement("shop_client_create_user");
            shop_client_create_user.setText("");
            Element shop_client_create_date=shop_client.addElement("shop_client_create_date");
            shop_client_create_date.setText("");
            Element shop_client_modify_user=shop_client.addElement("shop_client_modify_user");
            shop_client_modify_user.setText("");
            Element shop_client_modify_date=shop_client.addElement("shop_client_modify_date");
            shop_client_modify_date.setText("");
            Element kmt_shop_client_users_info=shop_info.addElement("kmt_shop_client_users_info");
            Element shop_client_user=kmt_shop_client_users_info.addElement("shop_client_user");
            Element shop_client_user_name=shop_client_user.addElement("shop_client_user_name");
            Element shop_client_user_status=shop_client_user.addElement("shop_client_user_status");
            Element shop_client_user_create_user=shop_client_user.addElement("shop_client_user_create_user");
            shop_client_user_create_user.setText("");
            Element shop_client_user_create_date=shop_client_user.addElement("shop_client_user_create_date");
            shop_client_user_create_date.setText("");
            Element shop_client_user_modify_user=shop_client_user.addElement("shop_client_user_modify_user");
            shop_client_user_modify_user.setText("");
            Element shop_client_user_modify_date=shop_client_user.addElement("shop_client_user_modify_date");
            shop_client_user_modify_date.setText("");
            shop_client_user_name.setText("cql_user_"+(10000+index));
            shop_client_user_status.setText("0");
        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYYMMddHHmmss");
        String dateStr=simpleDateFormat.format(new Date());
        String fileName="merchant_"+strTemp+"_"+"20210421000001.xml";
        XMLWriter writer = new XMLWriter(new FileOutputStream(new File("F:\\TestCsvDirectory\\xml" + File.separator + fileName)),format);//输出路径
        writer.write(doc);
        writer.close();
    }
}