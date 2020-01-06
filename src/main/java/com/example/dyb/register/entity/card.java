package com.example.dyb.register.entity;

import java.util.*;

public class card {
    public static void main(String[] args) {
        int number;
        int count;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            number = new Random().nextInt(33) + 1;
            count = 1;
            if(map.get(number) != null){
                count = map.get(number) + 1;
            }
            map.put(number,count);
        }
        Set<Integer> set = new TreeSet<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ">>>>>>>" + entry.getValue());
            set.add(entry.getValue());
        }
        System.out.println(set.toString());
    }
}
