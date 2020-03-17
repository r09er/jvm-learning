package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/14
 */
public class Test15 {

    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());
        System.out.println("------");
        int[] arr = new int[2];
        System.out.println(arr.getClass().getClassLoader());
        System.out.println("------");
        Test15[] test15s = new Test15[2];
        System.out.println(test15s.getClass().getClassLoader());
    }
}
