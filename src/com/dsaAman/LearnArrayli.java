package com.dsaAman;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayli {
    public static void main(String[] args) {
        /*ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Aman");

        System.out.println(studentsName);
        */

        List<Integer> newlist = new ArrayList<>();
        newlist.add(10);
        newlist.add(20);
        newlist.add(30);
        newlist.add(40);

        System.out.println(newlist);

        for (int i = 0; i < newlist.size(); i++) {
            System.out.println("The Element is: "+newlist.get(i));
        }

        for (Integer integer : newlist) {
            System.out.println("The Element is: " + integer);
        }

        Iterator<Integer> it = newlist.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator "+ it.next());
        }
        /*newlist.add(1,50);

        System.out.println(newlist);

        System.out.println(newlist.get(1));*/

        /*newlist.remove(2);

        System.out.println(newlist);

        newlist.remove(Integer.valueOf(50));

        System.out.println(newlist);

        newlist.clear();

        System.out.println(newlist);*/

        /*newlist.set(2,300);
        System.out.println(newlist);*/

    }


}
