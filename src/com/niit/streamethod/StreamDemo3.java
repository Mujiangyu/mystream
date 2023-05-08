package com.niit.streamethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo3 {
    public static void main(String[] args) {
        //Stream的终结方法

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"norman","qianqian","meimei","dongmei","xiaozhong","laoxu");


        //Consumer泛型表示流中的数据类型
        //accept方法的形参s：依次表示流里面的每一个数据
        //方法体：对每一个数据的操作处理 （打印）
      /*  list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.stream().forEach(s -> System.out.println(s));
*/
        //Count方法
/*        System.out.println(list.stream().count());*/

        //toArray空参方法，转换成Object类型
        Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));
        //toArray泛型方法，转换成指定的数据类型
        //IntFunction的泛型：具体类型的数据-------》new IntFunction<? extends Object[]>()
        //apply中的形参表示流中的数据的个数，要与数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：创建数组
      /*  String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/
        String[] arr = list.stream().toArray(s-> new String[s]);
        System.out.println(Arrays.toString(arr));
    }
}
