package com.random.demo;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/**
 * @author TODO
 * @description: TODO
 * @date 2019/5/28 19:58
 */
public class RandomDemo {

    private static final Base64 BASE_64_ENCONDER = new Base64();

    public static String getRandomCode()
    {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32];
        random.nextBytes(bytes);
        String rCode = null;
        try
        {
            rCode = new String(BASE_64_ENCONDER.encode(bytes), "UTF-8");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
            return "";
        }
        return rCode;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            String rCode = getRandomCode();
            System.out.println(rCode);
        }

    }
}
