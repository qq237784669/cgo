package com.cgo.common.utlis;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class RsaUtil {
    public static void main(String[] args) throws Exception {

        String cerPath = "D:\\a\\publickey.cer";		//证书文件路径
        String storePath = "D:\\a\\cgo.keystore";	//证书库文件路径
        String alias = "cgo";		//证书别名
        String storePw = "cgostorepwd";	//证书库密码
        String keyPw = "cgopwd";	//证书密码

        System.out.println("从证书获取的公钥为:" + getPublicKey(cerPath));
        System.out.println("从证书获取的私钥为:" + getPrivateKey(storePath, alias, storePw, keyPw));

    }


    private static String getPublicKey(String cerPath) throws Exception {
        CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509");
        FileInputStream fis = new FileInputStream(cerPath);
        X509Certificate Cert = (X509Certificate) certificatefactory.generateCertificate(fis);
        PublicKey pk = Cert.getPublicKey();
        String publicKey = new BASE64Encoder().encode(pk.getEncoded());
        return publicKey;
    }

    private static String getPrivateKey(String storePath, String alias, String storePw, String keyPw) throws Exception {
        FileInputStream is = new FileInputStream(storePath);
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(is, storePw.toCharArray());
        is.close();
        PrivateKey key = (PrivateKey) ks.getKey(alias, keyPw.toCharArray());
        System.out.println("privateKey:" + new BASE64Encoder().encode(key.getEncoded()));
        String privateKey = new BASE64Encoder().encode(key.getEncoded());
        return privateKey;
    }

}
