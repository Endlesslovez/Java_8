package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Nguyenx", "Xuan", "Minh");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("----------------------");
        list.forEach(t -> System.out.println(t));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(-1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(-6);
        integerList.add(-7);
        integerList.add(5);
        integerList.add(8);

        integerList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 0;
            }
        });

        integerList.forEach(t -> System.out.println(t));
        integerList.removeIf(t -> t > 5);
        integerList.forEach(t -> System.out.println(t));
        List<String> stringList = Arrays.asList("String", "Integer", "Object");

        Consumer<Integer> consumer = i -> System.out.println(i);
        Consumer<Integer> consumer1= consumer.andThen(i -> System.out.println("dsdasdas"+i));
        List<Integer> list1 = Arrays.asList(new Integer(1), new Integer(2));
        printList(list1, consumer1);

        List sd=stringList.stream().filter(u->u.equals("String")).collect(Collectors.toList());
        System.out.println("Stream"+ sd);

        Supplier<Double> supplier=()->Math.random();
        System.out.println(supplier.get());

    }

    public static void printList(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer integer : list) {
            consumer.accept(integer);
        }
        predicate(10,(i)->10>7);
    }
    public static void predicate(Integer number,Predicate<Integer> predicate){
        if(predicate.test(number)){
            System.out.println(number);
        }

    }

}
