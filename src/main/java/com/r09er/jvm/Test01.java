package com.r09er.jvm;

/**
 * 类加载过程
 * 1.加载Loading -> 从磁盘查找并加载类的二进制数据
 * 2.连接Linking
 *  2.1 验证Verification -> 校验字节码的正确性
 *  2.2 准备Preparation -> 为类的`静态变量`分配内存,并将其初始化为`默认值`
 *  2.3 解析Resolution -> 把类的`符号引用`转为`直接引用`
 * 3.初始化Initialization -> 为类的`静态变量`赋予正确的初始值
 * 4.使用
 * 5.卸载
 *
 * @author roger
 * @date 2020/3/10
 */
public class Test01 {
    /**
     * 在连接的准备阶段,会将a的值设为int类型的`默认值0`,在初始化阶段才会被1替换掉
     */
    public static int a = 1;
}
