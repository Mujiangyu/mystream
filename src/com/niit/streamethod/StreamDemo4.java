package com.niit.streamethod;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {

        //Collect(Collector collector)收集流中的数据，梵高集合中(list,Set,Map)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-25", "周芷若-女-23", "赵敏-女22", "张良-男-26");

        List<String> newlist = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        System.out.println(newlist);


        Set<String> newset = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toSet());
        System.out.println(newset);

        /*
        *toMap:参数一：表示键生成的规则
        *       参数二：表示值生成的规则
        *
        * 参数一：
        *       Function泛型一：表示流中每一个数据的类型
        *       Function泛型二：表示Map集合中要生成的键的数据类型
        *       apply方法形参：依次表示流中每一个数据
        *               方法体：生成键的规则的代码
        *             返回值：已经生成的键
        *
        * 参数二：
        *       Function泛型一：表示流中每个数据的类型
        *       Function泛型二：表示Map集合中要生成值的数据类型
        *        apply方法形参：依次表示流中每一个数据
         *               方法体：生成值的规则的代码
         *             返回值：已经生成的值
        *
        * */

      /*  Map<String, Integer> newmap = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/
        //将流中的数据收集到map集合中时，键的值是不能重复的否则会报错
        Map<String, Integer> newmap = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0]
                        ,
                        s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(newmap);
    }
}
