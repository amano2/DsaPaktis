package com.dsaAman;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriQ {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(45);
        pq.offer(24);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
