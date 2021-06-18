package com.example.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Util {

    /**
     * getSHA256.
     *
     * @param source
     *            source
     * @return str
     */
    public static String getSHA256(final String source) {
        byte[] pwd = null;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (final NoSuchAlgorithmException e) {
            // loggger.error(e);
        }
        try {
            md.update(source.getBytes("UTF-8"));
        } catch (final UnsupportedEncodingException e) {
            // loggger.error(e);
        }
        final byte[] digest = md.digest();
        pwd = new byte[digest.length];
        System.arraycopy(digest, 0, pwd, 0, digest.length);
        return byteToHexString(pwd);
    }

    /**
     *
     * @param b
     * @return
     */
    private static String byteToHexString(final byte[] b) {
        final StringBuffer hexString = new StringBuffer();
        for (final byte element : b) {
            String hex = Integer.toHexString(element & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            hexString.append(hex.toUpperCase());
        }
        return hexString.toString();
    }
}

