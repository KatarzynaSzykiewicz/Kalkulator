package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list = list.stream()
                .map(i -> i * 2)
                .map(i -> i + 123)
                .filter(i -> i > 125)
                .collect(Collectors.toList());

        System.out.println(list);

        for(Integer integer : list){
            List<Integer> list2 = new ArrayList<>();
            list2.add(integer * 2);
        }

        for(Integer integer : list){
            List<Integer> list3 = new ArrayList<>();
            list3.add(integer + 123);
        }

        List<Integer> list4 = new ArrayList<>();
        for(Integer integer : list){
            if(integer > 123){
                list4.add(integer);
            }
        }

        System.out.println(list4);

    }
}
