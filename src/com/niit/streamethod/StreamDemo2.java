package com.niit.streamethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list =new  ArrayList<>();
        Collections.addAll(list,"norman","norman","norman","meimei","qianqian","xiaozheng","laoxu","qingshan");

        ArrayList<String> list2 =new  ArrayList<>();
        Collections.addAll(list2,"norman","meimei","qianqian","xiaozheng","laoxu","qingshan");

        //distinct方法：去除流中的重复元素
        //底层时以来hashcode和equals方法进行去重，所以如果要添加自定义对像，一定要在javabean类中从写hashcode和equals方法
//        list.stream().distinct().forEach(s -> System.out.println(s));

        //concat方法：合并两个流
        //在合并时京可能的使两个流中的数据类型一致，如果不一致，会返回两个类型的公共父类
        //父类中，无法使用子类中的特有方法
//        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));

        //map方法：类型转换
        ArrayList<String> list3 =new  ArrayList<>();
        Collections.addAll(list3,"norman-1","meimei-2","qianqian-3","xiaozheng-4","laoxu-5","qingshan-6");


        //第一个数据类型：流中原本的数据类型
        //第二个数据类型：要转成之后的数据类型
        //apply的形参s：依次表示流中的每个数据
        //返回值：表示转换之后的数据
       /* list3.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String age = arr[1];
                int nage = Integer.parseInt(age);
                return nage;


                return Integer.ParseInt(s.split("-")[1])

            }
        }).forEach(s -> System.out.println(s));*/

        list3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));





    }
}
