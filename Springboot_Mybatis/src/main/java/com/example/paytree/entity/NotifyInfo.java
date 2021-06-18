package com.example.paytree.entity;

import lombok.Data;

import static org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV;

/**
 * 〈mpm需要截取的表〉
 *
 * @author cql
 * @create 2020/12/21
 * @since 1.0.0
 */
@Data
public class NotifyInfo extends  BaseBean{
    private String orderDetailId;
    private String notifyUrl;
    private String status;
    private String createTime;
    private String updateTime;
    private String extField1;
    private String extField2;
    @Override
    public String toRow() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",orderDetailId, ESCAPE_CSV.translate(this.notifyUrl),
                status,createTime,updateTime,extField1,extField2);
    }

    @Override
    public String[] getHear() {
        String[] hear=new String[]{"orderDetailId","notifyUrl","status","createTime","updateTime",
                "extField1","extField2"};
        return hear;
    }
    @Override
    public String getFileType(){
        return "notifyInfo";
    }
}