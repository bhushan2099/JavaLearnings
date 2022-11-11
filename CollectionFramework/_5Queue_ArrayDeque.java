package com.CollectionsFramework;

import java.util.ArrayDeque;

public class _5Queue_ArrayDeque {

    /*
    ArrayDeque is a double ended queue. We can add elements as well as remove elements from this queue from
    both the ends.

    Array Deque class implements Deque interface hence can use methods like offerFirst(), offerLast(), peekFirst(), peekLast(), pollFirst(), pollLast().
     */

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // offer() is a method of Queue interface
        adq.offer(23);

        // offerFirst() and offerLast() are methods of ArrayDeque class
        adq.offerFirst(45);
        // offerFirst() adds elements from the front of queue ie from the head of queue

        adq.offerLast(55);   // offer() and offerLast() do the same work
        // offerLast() adds elements from the back of queue ie from the tail of queue

        adq.offer(36);

        System.out.println(adq);

        System.out.println(adq.peek());         // peek() the top most element
        System.out.println(adq.peekFirst());    // peekFirst() shows top most element
        System.out.println(adq.peekLast());     // peekLast() shows last element in queue

        System.out.println(adq);
        System.out.println(adq.poll());         // remove the top most element
        System.out.println(adq);
        System.out.println(adq.pollFirst());    // remove the top most element
        System.out.println(adq);
        System.out.println(adq.pollLast());    // remove the last element

        /*
        Using ArrayDeque we can implement Stack as well. Stack is LIFO - Last In First Out
        Hence to use ArrayDeque as Stack we use pollLast() so that whatever was entered last comes out first
         */

        for(Integer ele: adq){
            System.out.println(ele);
        }




    }
}
