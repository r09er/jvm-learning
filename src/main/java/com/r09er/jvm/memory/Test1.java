package com.r09er.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * JVM内存
 * 调整jvm参数,可以看到很快就会outOfMemory
 *
 * @author roger
 * @date 2020/3/21
 */
public class Test1 {

    public static void main(String[] args) {
        List<Test1> lis = new ArrayList<>();

        while (true) {
            lis.add(new Test1());
        }
    }
}
