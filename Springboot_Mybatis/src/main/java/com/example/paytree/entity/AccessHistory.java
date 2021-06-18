package com.example.paytree.entity;

import lombok.Data;

import static org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV;

/**
 * 〈〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@Data
public class AccessHistory extends BaseBean {
    private String id;

    private String postData;

    private String apiUrl;

    private String accessType;

    private String parentId;

    private String createTime;

    private String extField1;

    private String extField2;
    @Override
    public String toRow() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", (this.id),(parentId),ESCAPE_CSV.translate(this.postData),
                ESCAPE_CSV.translate(this.apiUrl),accessType,createTime,extField1,extField2);
    }

    @Override
    public String[] getHear() {
        String[] hear=new String[]{"id","parentId","postData","apiUrl","accessType",
                "createTime","extField1","extField2"};
        return hear;
    }
    @Override
    public String getFileType(){
        return "accessHistory";
    }
}