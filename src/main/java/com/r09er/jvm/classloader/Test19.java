package com.r09er.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * ext类加载器加载的类
 * @author roger
 * @date 2020/3/17
 */
public class Test19 {

    public static void main(String[] args) {
        AESKeyGenerator keyGenerator = new AESKeyGenerator();
        System.out.println(keyGenerator.getClass().getClassLoader());
        System.out.println(Test19.class.getClassLoader());
    }
}
