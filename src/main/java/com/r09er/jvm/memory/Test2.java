package com.r09er.jvm.memory;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.concurrent.TimeUnit;

/**
 * 栈溢出试验,64位操作系统默认是1024k.现调整为160k,使用jvisualvm观察
 *
 * @author roger
 * @date 2020/3/22
 */
public class Test2 {

    private int depth;

    public int getDepth() {
        return depth;
    }
    public void push() {
        depth++;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        push();

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.push();
        } catch (Exception e) {
            System.out.println(test2.getDepth());
            e.printStackTrace();
        }
    }

}
