package com.r09er.jvm.classloader;

/**
 *
 * @author roger
 * @date 2020/3/12
 */
public class Test08 {

    public static void main(String[] args) {
        try {
            Class<?> clzz = Class.forName("java.lang.String");
            //如果返回null,证明是由BootStrap加载器进行加载的
            System.out.println(clzz.getClassLoader());


            Class<?> customClass = Class.forName("com.r09er.jvm.classloader.Custom");
            System.out.println(customClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Custom{

}
