package com.dsaAman;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQ {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(20);
        queue.offer(12);
        queue.offer(45);
        queue.offer(98);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}
