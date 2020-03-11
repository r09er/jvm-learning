package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/11
 */
public class Test05 {

    public static void main(String[] args) {
        Parent5[] parent5Arr = new Parent5[1];
        System.out.println(parent5Arr.getClass());

        Parent5[][] parent5Arr2 = new Parent5[1][1];
        System.out.println(parent5Arr2.getClass());

        System.out.println(parent5Arr.getClass().getSuperclass());
        System.out.println(parent5Arr2.getClass().getSuperclass());

        System.out.println("===");
        int[] intArr = new int[1];
        System.out.println(intArr.getClass());
        System.out.println(intArr.getClass().getSuperclass());

    }
}
class Parent5{
    static {
        System.out.println("Parent5 static block");
    }
}
