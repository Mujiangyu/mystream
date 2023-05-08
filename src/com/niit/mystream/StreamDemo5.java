package com.niit.mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //一堆零散的数据获取stream流
        //零散的数据必须是同种类型

        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以床底一些零散数据，也可以传递数组
        //但是，数组必须时引用类型的，如果传递基本数据类型。会把数组整体当作一个元素，放入到stream流中

        Stream.of(1,2,3,4,5).forEach(s -> System.out.print(s));

        Stream.of("a","b","c","d","e").forEach(s -> System.out.println(s));



    }
}
