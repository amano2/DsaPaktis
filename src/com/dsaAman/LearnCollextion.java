package com.dsaAman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollextion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(55);
        list.add(12);
        list.add(45);
        list.add(78);
        list.add(23);
        list.add(50);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,23));
        Collections.sort(list);
        //Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        
    }
}
