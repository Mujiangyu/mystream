package com.niit.streamethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list =new  ArrayList<>();
        Collections.addAll(list,"norman","meimei","qianqian","xiaozheng","laoxu","qingshan");


        //filter方法
      /*  list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true，表示当前数据留下
                //如果返回值为false，表示当前数据不要

                return s.startsWith("n");
            }
        }).forEach(s -> System.out.println(s));

        list.stream().filter( s->  s.startsWith("n")).forEach(s -> System.out.println(s));
                //如果返回值为true，表示当前数据留下
                //如果返回值为false，表示当前数据不要
    */

        //limit方法：获取集合中的前N个元素
//        list.stream().limit(3).forEach(s -> System.out.println(s));

        //skip方法:跳过流中的前N个元素
//        list.stream().skip(2).forEach(s -> System.out.println(s));





    }
}
