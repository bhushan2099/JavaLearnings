package com.CollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _4Queue_PriorityQueue {

    /* Priority Queue class implements Queue interface, in which elements are assigned priority
    on the basis of their size or order or any other feature. Like if the element is greater, then it
    should be given the priority or if element is small then it should be given priority etc.
     */

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        /* order changes because heap data structure is getting implemented in background
        due to which minheap(the smallest element) comes on the top.
         */

        System.out.println(pq.poll());  // the element which has the highest priority come out of queue
        // currently the smallest element has the priority by default

        System.out.println(pq);
        System.out.println(pq.peek());

        // if we have to give priority to max element, we do following -

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq1.offer(44);
        pq1.offer(57);
        pq1.offer(63);
        pq1.offer(79);

        System.out.println(pq1);
        /* this time me get maxheap(maximum element) at the top as we have mentioned the condition
        while creating the object of PriorityQueue 'pq1'. */

        System.out.println(pq1.poll());  // the element which has the highest priority come out of queue
        // currently the largest element has the priority

        System.out.println(pq1);
        System.out.println(pq1.peek());


        for(Integer ele: pq1){
            System.out.println(ele);
        }


    }
}
