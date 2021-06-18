package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.common.entity.KeyBean;
import com.example.onepay.service.OnepayAccessHistoryService;
import com.example.onepay.service.OnepayDigitalSignService;
import com.example.paytree.entity.DigitalSign;
import com.example.paytree.entity.RsaKeyPair;
import com.example.paytree.service.PaytreeAccessHistoryService;
import com.example.paytree.service.PaytreeDigitalSignService;
import com.example.util.Base64;
import com.example.util.EncryptUtils;
import com.example.util.RSAUtils;
import com.example.util.StringUtils;

/**
 * 〈RSA 加签&验签使用〉
 *
 * @author cql
 * @create 2019/12/17
 * @since 1.0.0
 */
@RestController
@RequestMapping("/RSA")
public class RSAController {

@Autowired
public OnepayAccessHistoryService onepayAccessHistoryService;
@Autowired
public PaytreeAccessHistoryService paytreeAccessHistoryService;
@Autowired
public PaytreeDigitalSignService paytreeDigitalSignService;
@Autowired
public OnepayDigitalSignService onepayDigitalSignService;

    public static final Logger LOG=Logger.getLogger(RSAController.class);
    @PostMapping(value = "/getSign/{mode}/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String GetSign(@RequestBody JSONObject requestInfo, @PathVariable String  mode, @PathVariable String  id){
        LOG.info("233");
        return getSignFromRSA(requestInfo,getPriKey(mode,id));
    }

    @PostMapping(value = "/getSign/{mode}/{id}/isCbwPay", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String GetSignForCbw(@RequestBody JSONObject requestInfo, @PathVariable String  mode, @PathVariable String  id){
        return getSignFromRSAForCBW(requestInfo,getPriKey(mode,id));
    }
    @PostMapping(value = "/getPublicKey", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getKey(){
        //// 1.生成Gateway服务器段的公钥和秘钥
        final RsaKeyPair rsaKeyPair = RSAUtils.genKeyPair();
        String clientPublicKey = rsaKeyPair.getPublicKey();
        return Base64.encode(clientPublicKey.getBytes());
    }
    @PostMapping(value = "/getPublicKeyAndPrivateKey", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public KeyBean getPublicKeyAndPrivateKey(){
        //// 1.生成Gateway服务器段的公钥和秘钥
        final RsaKeyPair rsaKeyPair = RSAUtils.genKeyPair();
        String clientPublicKey = rsaKeyPair.getPublicKey();
        String clientPrivateKey=rsaKeyPair.getPrivateKey();
        KeyBean keyBean=new KeyBean();
        keyBean.setPrivateKey(clientPrivateKey);
        keyBean.setPublickeyForBody(Base64.encode(clientPublicKey.getBytes()));
        keyBean.setPublickeyForDb(clientPublicKey);
        return keyBean;
    }
    public String getSignFromRSA(JSONObject requestInfo,String key){
        String jsonRes = JSONObject.toJSONString(requestInfo);
        return  EncryptUtils.signByRsa(jsonRes,key);
    }
    public String getSignFromRSAForCBW(JSONObject requestInfo,String key){
        String jsonRes = JSONObject.toJSONString(requestInfo);
        return  EncryptUtils.signByRsaForCbw(jsonRes,key);
    }

    @PostMapping(value = "/verifyByRsa/{mode}/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean verifyByRsa(@RequestBody JSONObject responseInfo,@PathVariable String  mode, @PathVariable String  id){
        if(responseInfo==null||StringUtils.isEmpty(mode)||StringUtils.isEmpty(id)){
            return false;
        }
        String jsonRes = JSONObject.toJSONString(responseInfo);
        return EncryptUtils.verifyByRsa(jsonRes,getPulicKey(mode,id),"sign");
    }
    public String getPriKey(String mode,String id ){
        DigitalSign digitalSign= new DigitalSign();
        if("C01".equals(mode)){
            digitalSign.setTerminalCode(id);
        }else if("B01".equals(mode)){
            digitalSign.setBranchCode(id);
        }
        String key=paytreeDigitalSignService.getPriKey(digitalSign);
        if(StringUtils.isEmpty(key)){
            key=onepayDigitalSignService.getPriKey(digitalSign);
        }
        return key;
    }
    public String getPulicKey(String mode,String id ){
        DigitalSign digitalSign= new DigitalSign();
        if("C01".equals(mode)){
            digitalSign.setTerminalCode(id);
        }else if("B01".equals(mode)){
            digitalSign.setBranchCode(id);
        }
        String key=paytreeDigitalSignService.getPubliKey(digitalSign);
        if(StringUtils.isEmpty(key)){
            key=onepayDigitalSignService.getPubliKey(digitalSign);
        }
        return key;
    }
}