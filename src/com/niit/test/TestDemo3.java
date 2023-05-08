package com.niit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList,"袁天罡,323","李星云,25","张子凡,24","李存勖,30","李茂贞,34","李嗣源,43");

        ArrayList<String> wemanList = new ArrayList<>();
        Collections.addAll(wemanList,"姬如雪,23","女师妹,22","女帝,30","蚩梦,23","奥姑，30","石瑶，34");

        List<String> newManList = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2).collect(Collectors.toList());

        List<String> newWemanList = wemanList.stream()
                .filter(s -> s.startsWith("女")).skip(1)
                .collect(Collectors.toList());

        List<String> newList = Stream.concat(newManList.stream(), newWemanList.stream())
                .collect(Collectors.toList());

        List<Actor> collect = newList.stream()
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
