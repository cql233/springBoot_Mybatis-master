package com.example.util;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import static com.example.util.extendIfnoFormatUtil.getNewStordStr;

public class EncryptUtils {

    private static final String[] hexDigits =
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /**
     * 加密算法RSA.
     */
    public static final String KEY_ALGORITHM = "RSA";

    /**
     * 签名算法.
     */
    public static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

    /**
     * MD5编码.
     *
     * @param str
     *            原始字符串
     * @return 经过MD5加密之后的结果
     */
    public static String md5(final String str) {
        String resultString = null;

        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(str.getBytes()));
        } catch (final Exception exception) {
            exception.printStackTrace();
        }

        return resultString;
    }

    /**
     * MD5加签.
     *
     * @param str
     *            原始字符串
     * @return 经过MD5加签之后的结果
     * @throws Exception
     *             异常
     */
    public static String signByMd5(final String str, final String key) {
        String resultString = "";
        try {
            final String sortStr = SignatureUtils.sign(str, key, "sign");
            resultString = EncryptUtils.md5(sortStr);
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }

    /**
     * RSA加签.
     *
     * @param str
     *            原始字符串
     * @return 经过RSA加签之后的结果
     * @throws Exception
     *             异常
     */
    public static String signByRsa(final String str, final String privateKey) {
        byte[] data = null;
        Signature signature = null;
        String resultString = "";
        try {
            final String sortStr =getNewStordStr( SignatureUtils.sign(str, "sign"));
//            final String sortStr = SignatureUtils.sign(str, "sign");
            data = SHA256Util.getSHA256(sortStr).getBytes("UTF-8");
            final byte[] keyBytes = Base64.decode(privateKey);
            final PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            final PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
            signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateK);
            signature.update(data);
            resultString = Base64.encode(Base64.encode(signature.sign()).getBytes("UTF-8"));
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }
    public static String signByRsaForCbw(final String str, final String privateKey) {
        byte[] data = null;
        Signature signature = null;
        String resultString = "";
        try {
            final String sortStr =getNewStordStr( SignatureUtils.sign(str, "sign"));
//            final String sortStr = SignatureUtils.sign(str, "sign");
            data = SHA256Util.getSHA256(sortStr).getBytes("UTF-8");
            final byte[] keyBytes = Base64.decode(privateKey);
            final PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            final PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
            signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateK);
            signature.update(data);
            resultString = Base64.encode(Base64.encode(signature.sign()).getBytes("UTF-8"));
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }

    /**
     * RSA加签.
     *
     * @param str
     *            原始字符串
     * @param privateKey
     *            私钥
     * @param ignoreItemName
     *            忽略的项目(不参与签名)
     * @return 经过RSA加签之后的结果
     * @throws Exception
     *             异常
     */
    public static String signByRsaForCpay(final String str, final String privateKey, final String ignoreItemName) {
        byte[] data = null;
        Signature signature = null;
        String resultString = "";
        try {
            final String sortStr = SignatureUtils.signForCpay(str, ignoreItemName);
            data = SHA256Util.getSHA256(sortStr).getBytes("UTF-8");
            final byte[] keyBytes = Base64.decode(privateKey);
            final PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            final PrivateKey privateK = keyFactory.generatePrivate(pkcs8KeySpec);
            signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateK);
            signature.update(data);
            resultString = Base64.encode(Base64.encode(signature.sign()).getBytes("UTF-8"));
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }

    /**
     * RSA验签.
     *
     * @param str
     *            原始字符串
     * @return 验签是否成功
     */
    public static boolean verifyByRsa(final String str, final String publicKey, final String signName) {
        byte[] data = null;
        boolean result = false;
        try {
            final String sortStr = SignatureUtils.sign(str, "sign");
            data = SHA256Util.getSHA256(sortStr).getBytes("UTF-8");
            final byte[] keyBytes = Base64.decode(publicKey);
            final X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            final PublicKey publicK = keyFactory.generatePublic(keySpec);
            final Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(publicK);
            signature.update(data);
            final String sign = getField(str, signName);
            if (null != sign && !sign.equals("")) {
                result = signature.verify(Base64.decode(new String(Base64.decode(sign))));
            } else {
                // 如果取不到sign值，默认验签失败
                result = false;
            }
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    /**
     * RSA验签.
     *
     * @param str
     *            原始字符串
     * @return 验签是否成功
     */
    public static boolean verifyByRsaForCpay(final String str, final String publicKey, final String ignoreItemName) {
        byte[] data = null;
        boolean result = false;
        try {
            final String sortStr = SignatureUtils.signForCpay(str, ignoreItemName);
            data = SHA256Util.getSHA256(sortStr).getBytes("UTF-8");
            final byte[] keyBytes = Base64.decode(publicKey);
            final X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            final KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            final PublicKey publicK = keyFactory.generatePublic(keySpec);
            final Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(publicK);
            signature.update(data);
            final String sign = getCertSignForCpay(str);
            if (null != sign && !sign.equals("")) {
                result = signature.verify(Base64.decode(new String(Base64.decode(sign))));
            } else {
                // 如果取不到sign值，默认验签失败
                result = false;
            }
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    /**
     * MD5加签(JCB汎用).
     *
     * @param str
     *            原始字符串
     * @return 经过MD5加签之后的结果
     * @throws Exception
     *             异常
     */
    public static String signByMd5ForCommonIssue(final String str, final String key) {
        String resultString = "";
        try {
            final String sortStr = SignatureUtils.signForCommonIssue(str, key, "sign");
            resultString = EncryptUtils.md5(sortStr);
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }

    /**
     * 转换字节数组为16进制字串.
     *
     * @param bytes
     *            字节数组
     * @return 16进制字串
     */
    private static String byteArrayToHexString(final byte[] bytes) {
        final StringBuilder resultSb = new StringBuilder();

        for (final byte val : bytes) {
            resultSb.append(byteToHexString(val));
        }

        return resultSb.toString();
    }

    /**
     * 转换byte到16进制.
     *
     * @param bytes
     *            要转换的byte
     * @return 16进制格式
     */
    private static String byteToHexString(final byte bytes) {
        int val = bytes;

        if (val < 0) {
            val = 256 + val;
        }

        final int d1 = val / 16;
        final int d2 = val % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    private static String getCertSignForCpay(String jsonString) {
        String signData = "";
        JSONObject jsonObj = (JSONObject) JSON.parse(jsonString);
        if (jsonObj != null) {
            JSONObject data = (JSONObject)jsonObj.get("data");
            if (data != null) {
                signData = data.getString("certSign");
            }
        }
        return signData;
    }

    /**
     * 获取对应值.
     *
     * @param jsonString
     *            原字符串
     * @param fieldName
     *            项目名
     * @return 值
     */
    private static String getField(final String jsonString, final String fieldName) {
        String field = "";
        final JSONObject jsonObj = (JSONObject) JSON.parse(jsonString);
        if (jsonObj != null) {
            field = jsonObj.getString(fieldName);
        }
        if (field == null) {
            String dataJsonString = jsonObj.getString("data");
            JSONObject dataJsonObj = (JSONObject) JSON.parse(dataJsonString);
            field = dataJsonObj.getString(fieldName);
        }
        return field;
    }
}