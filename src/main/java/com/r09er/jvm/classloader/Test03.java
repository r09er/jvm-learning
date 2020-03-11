package com.r09er.jvm.classloader;

/**
 * final修饰的常量,在编译阶段,就会被放在调用这个常量的方法的所在的类的常量池
 * 所以该例子中,str2会被放在Test03的常量池中
 *
 * 本质上,调用类并没有直接引用到定义常量的类
 * @author roger
 * @date 2020/3/11
 */
public class Test03 {
    public static void main(String[] args) {
        //情况1.没有使用final
//        System.out.println(Parent2.str);
        //情况2,使用了final
        System.out.println(Parent3.str2);
    }
}

class Parent3 {
    /**
     * 注意是final
     */
    public static String str = "hello jvm";
    public static final String str2 = "hello jvm";

    static {
        System.out.println("Parent2 static block");
    }
}
