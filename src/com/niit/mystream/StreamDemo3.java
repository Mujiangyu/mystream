package com.niit.mystream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合获取stream流
        //双列集合无法直接获取stream流，需要将其转换为单列集合在获取

        HashMap<String,String> hm = new HashMap<>();

        hm.put("a","1");
        hm.put("b","2");
        hm.put("c","3");
        hm.put("d","4");

        //第一种获取stream流的方法：用entries对象获取stream流
        hm.entrySet().stream().forEach(s -> System.out.println(s));
        //第二种获取stream流的方法
        hm.keySet().stream().forEach(k -> System.out.println(k));
    }
}
