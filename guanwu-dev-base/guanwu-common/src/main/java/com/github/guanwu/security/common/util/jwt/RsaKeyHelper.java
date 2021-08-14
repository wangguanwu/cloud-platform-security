package com.github.guanwu.security.common.util.jwt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guanwu
 * @created on 2021-08-10 12:23:03
 **/
public class RsaKeyHelper {

    /**
     * 获取公钥
     * @param fileName
     * @return
     * @throws Exception
     */
    public PublicKey getPublicKey(String fileName) throws Exception {
        InputStream resourceStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        assert resourceStream != null;
        DataInputStream dis = new DataInputStream(resourceStream);
        byte []keyBytes = new byte[resourceStream.available()];
        dis.readFully(keyBytes);
        dis.close();
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    /**
     * 获取私钥
     * @param fileName
     * @return
     * @throws Exception
     */
    public PrivateKey gePrivateKey(String fileName) throws Exception {
        InputStream resourceStream = this.getClass().getResourceAsStream(fileName);
        assert resourceStream != null;
        DataInputStream dis = new DataInputStream(resourceStream);
        byte []bytes = new byte[resourceStream.available()];
        dis.readFully(bytes);
        dis.close();
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(bytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }



    /**
     * 获取公钥
     * @param publicKey
     * @return
     * @throws Exception
     */
    public PublicKey getPublicKey(byte[] publicKey) throws Exception {
        X509EncodedKeySpec spec = new X509EncodedKeySpec(publicKey);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    /**
     * 获取私钥
     * @param privateKey
     * @return
     * @throws Exception
     */
    public PrivateKey getPrivateKey(byte[] privateKey) throws Exception {
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(privateKey);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    public PrivateKey getPrivateKey(String fileName) throws Exception {
        byte []keyBytes;
        try (InputStream resourceStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
             DataInputStream dis = new DataInputStream(resourceStream)) {
            keyBytes = new byte[resourceStream.available()];
            dis.readFully(keyBytes);
        }
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    /**
     * 生成私钥和公钥
     * @param publicKeyFileName
     * @param privateKeyFileName
     * @param password
     * @throws Exception
     */
    public static void generateKey(String publicKeyFileName, String privateKeyFileName,
                            String password) throws Exception {
        KeyPair keyPair = getKeyPair(password);
        byte[] publicKeyBytes = keyPair.getPublic().getEncoded();
        try (FileOutputStream fos = new FileOutputStream(publicKeyFileName)) {
            fos.write(publicKeyBytes);
            fos.flush();
        }
        byte[] privateKeyBytes = keyPair.getPrivate().getEncoded();
        try (FileOutputStream fos = new FileOutputStream(privateKeyFileName)) {
            fos.write(privateKeyBytes);
            fos.flush();
        }
    }

    /**
     * 生成公钥
     * @param password
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException
     */
    public static byte[] generatePublicKey(String password) throws IOException, NoSuchAlgorithmException {
        return getKeyPair(password).getPublic().getEncoded();
    }

    private static KeyPair getKeyPair(String password) throws IOException, NoSuchAlgorithmException{
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        SecureRandom secureRandom = new SecureRandom(password.getBytes(StandardCharsets.UTF_8));
        keyPairGenerator.initialize(1024, secureRandom);
        return keyPairGenerator.genKeyPair();
    }

    public static byte[] generatePrivateKey(String password) throws IOException, NoSuchAlgorithmException {
        return getKeyPair(password).getPrivate().getEncoded();
    }

    public static String toHexString(byte []b) {
        return new BASE64Encoder().encodeBuffer(b);
    }

    public static final byte[] toBytes(String s) throws Exception {
        return new BASE64Decoder().decodeBuffer(s);
    }

    /**
     * 生成私钥和公钥对
     * @param password
     * @return
     * @throws IOException
     * @throws NoSuchAlgorithmException
     * @return Map
     */
    public static Map<String, byte[]> generateKey(String password) throws IOException, NoSuchAlgorithmException {
        KeyPair keyPair = getKeyPair(password);
        byte []publicKeyBytes = keyPair.getPublic().getEncoded();
        byte []privateKeyBytes = keyPair.getPrivate().getEncoded();
        Map<String, byte[]> map = new HashMap<>();
        map.put("pub", publicKeyBytes);
        map.put("pri", privateKeyBytes);
        return map;
    }

}
