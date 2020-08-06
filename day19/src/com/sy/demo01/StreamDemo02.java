package com.sy.demo01;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Title: StreamDemo02
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/13 0013 13:43
 */
public class StreamDemo02 {

    public static void main(String[] args) {
        // 获取stream 流
        //  1  获取list 集合的
        List<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();
        System.out.println(s1);

        // 2  获取set 结合
        Set<String> set = new HashSet<>();
        Stream<String> s2 = set.stream();
        System.out.println(s2);

        // 3  获取数组
        String[] strArray = new  String[5];
        Stream<String> s3 = Stream.of(strArray);
        System.out.println(s3);

        // 4  获取map  流只是针对于线性的  非线性不考虑了
        Map<String,String> map = new HashMap<>();

        // 4.1 将map 变为线性的
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();

        // 4.2   Map.entry
        Stream<Map.Entry<String,String>> mapStream =map.entrySet().stream();


    }
}
