package com.example.util;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

import com.example.paytree.entity.RsaKeyPair;


public class RSAUtils {

    /**
     * 加密算法RSA.
     */
    public static final String KEY_ALGORITHM = "RSA";

    /**
     * 获取公钥的key.
     */
    private static final String PUBLIC_KEY = "RSAPublicKey";

    /**
     * 获取私钥的key.
     */
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    /**
     * <p>
     * 生成密钥对(公钥和私钥).
     * </p>
     *
     * @return
     */
    public static RsaKeyPair genKeyPair() {
        final RsaKeyPair rsaKeyPair = new RsaKeyPair();
        try {
            final KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
            keyPairGen.initialize(2048);
            final KeyPair keyPair = keyPairGen.generateKeyPair();
            final RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
            final RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
            final Map<String, Object> keyMap = new HashMap<>(2);
            keyMap.put(PUBLIC_KEY, publicKey);
            keyMap.put(PRIVATE_KEY, privateKey);
            final Key key1 = (Key)keyMap.get(PRIVATE_KEY);
            final Key key2 = (Key)keyMap.get(PUBLIC_KEY);
            rsaKeyPair.setPublicKey(Base64.encode(key2.getEncoded()));
            rsaKeyPair.setPrivateKey(Base64.encode(key1.getEncoded()));
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
        return rsaKeyPair;
    }

}