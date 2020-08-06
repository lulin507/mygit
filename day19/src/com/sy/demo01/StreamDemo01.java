package com.sy.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: StreamDemo01
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/13 0013 13:35
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("李朋宇");
        list.add("张鹏宇");
        list.add("李爱国");
        list.add("李子");
        list.add("呵呵呵");
        list.add("admin");

        // 过滤这个集合
        // 1 获取流
        list.stream().filter(e -> e.startsWith("李")).filter(e -> e.length() == 3).forEach(e -> System.out.println(e));
        // 获取姓李的

        // 获取三个字



    }
}
