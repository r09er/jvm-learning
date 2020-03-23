package com.r09er.jvm.bytecode;

/**
 * 反编译当前类的字节码文件
 * javap com.r09er.jvm.bytecode.Test1
 * Compiled from "Test1.java"
 * public class com.r09er.jvm.bytecode.Test1 {
 *   public com.r09er.jvm.bytecode.Test1();
 *   public int getA();
 *   public void setA(int);
 * }
 * 查看详细的字节码内容
 * javap -c com.r09er.jvm.bytecode.Test1
 *
 * @author roger
 * @date 2020/3/21
 */
public class Test1 {

    private int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
