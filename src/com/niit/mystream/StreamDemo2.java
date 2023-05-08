package com.niit.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        //单列集合获取stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
       /* //获取到一条stream流，并把集合中的数据放到流上
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));*/

        list.stream().forEach(s -> System.out.println(s));




    }
}
