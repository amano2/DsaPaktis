package com.dsaAman;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHshSet {
    public static void main(String[] args) {
       //Set<Integer> set = new HashSet<>();
       // Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(52);
        set.add(54);
        set.add(27);
        set.add(65);

        System.out.println(set);

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(54));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
