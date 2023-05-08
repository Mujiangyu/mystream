package com.niit.mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //数组获取stream流
        //调用工具类Arrays中的静态方法

        int[] arr0= {1,2,3,4,5,6,7,8,9};
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        String[] arr1 = {"a","b","c"};
/*
        Arrays.stream(arr).forEach(s -> System.out.println(s));
        Arrays.stream(arr1).forEach(s -> System.out.println(s));*/

//        Stream.of(arr1).forEach(s -> System.out.println(s));

        Stream.of(arr).forEach(s -> System.out.println(s));
    }
}
