package com.r09er.jvm.classloader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author roger
 * @date 2020/3/13
 */
public class Test13 {

    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        //向上遍历父classLoader
        while (null != loader) {
            loader = loader.getParent();
            System.out.println(loader);
        }
    }

    private static int test(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                Integer showTimes = map.get(num);
                map.put(num, showTimes + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

}

