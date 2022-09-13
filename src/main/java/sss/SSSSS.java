package sss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class SSSSS extends Sos implements Ops {

    @Override
    public Integer get() {
        return (Integer) super.get();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ssss");
        Object o = new Object();
        o.clone();



        Ops.say();
        SSSSS s = new SSSSS();
        s.say2();


        int a = 2;
        int b = 3;
        b = b + SSSSS.a;;

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        integerStream
                .map(x -> x + a)
                .map(x -> x + b)
                .forEach(System.out::println);

    }
}

class Sos {

    public Number get() {
        return Integer.MAX_VALUE;
    }
}

interface Ops {
   public static final int a = 10;

    static void say() {
        System.out.println("sdsdasd");
    }

    default void say2() {
        System.out.println("sdsdasd");
    }
}
