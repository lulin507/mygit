package com.sy.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Title: StreamDemo03
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/7/13 0013 14:24
 */
public class StreamDemo03 {

    public static void main(String[] args) {
        /**
         * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
         * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
         *
         * 3. 第二个队伍只要姓李并且年龄超过30岁的成员姓名；存储到一个新集合中。
         * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
         *
         * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
         * 6. 根据姓名创建 Person 对象；存储到一个新集合中。
         * 7. 打印整个队伍的Person对象信息。
         */


        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("张小三",18));
        list1.add(new Person("李小三",20));
        list1.add(new Person("张三",27));
        list1.add(new Person("李小四",19));
        list1.add(new Person("王小五",30));

        list1.add(new Person("赵小六",18));
        list1.add(new Person("王小七",19));
        list1.add(new Person("赵八",10));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("李小三",31));
        list2.add(new Person("王小三",20));
        list2.add(new Person("李小四",28));
        list2.add(new Person("李小五",32));
        list2.add(new Person("李三",27));
        list2.add(new Person("李小六",32));
        list2.add(new Person("李小七",32));
        list2.add(new Person("赵十",10));

        Stream<Person> s1 = list1.stream().filter(e -> e.getName().length() == 3).limit(3);

        Stream<Person> s2 = list2.stream().filter(e -> e.getAge() >= 30).filter(e -> e.getName().startsWith("李")).skip(2);
        // "张小三"  李小三 李小四  李小六  李小七
        Stream<Person> s = Stream.concat(s1,s2);

        s.map(e -> {
            List<String> list = new ArrayList<>();
            list.add(e.getName());
            return list;
        }).forEach(e -> System.out.println(e));
    }
}

class  Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

