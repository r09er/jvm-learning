package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/11
 */
public class Test06 {

    public static void main(String[] args) {
        System.out.println(Child6.a);
        System.out.println(Child6.a);
    }
}

interface Parent6 {
    public static int a = 5;
}

interface Child6 extends Parent6 {
    public static int b = 6;

}