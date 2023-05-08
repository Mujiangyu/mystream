package com.niit.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

       /* //把所有以 张 开头的元素放在一个新的集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                list1.add(s);
            }
        }
        //把所有以 张 开头的，且长度为3的元素放到一个新的集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length()==3){
                list2.add(s);
            }
        }
        System.out.println(list2);*/

        list.stream().filter(name -> name.startsWith("张")).filter(name ->name.length()==3).forEach(name -> System.out.println(name));













    }
}
