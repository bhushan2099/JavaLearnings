package com.CollectionsFramework;

import java.util.*;

public class _3List_Queue_LinkedList {

    // Queue is a FIFO --> 'First In First Out' kind of data structure.

    // It has two ends - Rear and Front. Elements are Added in queue from Rear end and Deleted from Front end

    // Eg. Ticket Queue, the person who enter first gets the ticket first and move out first hence FIFO.

    // Queue can be implemented using LinkedList.

    // LinkedList implements List interface as well as Queue interface hence all the method of List and Queue are applicable for LinkedList

    // Elements in Linked List act as independent objects which have 3 attributes - the value, address of previous value and address of next value

    // Due to this address availability adding elements in LinkedList is fast and requires less computational cost. Manipulation is faster as compared to ArrayList as there is no need to shift any item.



    public static void main(String[] args) {

        // LinkedList using Queue Interface

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(13);   // offer() is used to add elements to queue.
        queue.add(14);   // add() is an alternative method for offer()
        queue.offer(15);   // the difference is that offer() return true is element is successfully added and false if not successfully added
        queue.add(16);   // add() returns true is element is successfully added and an exception if not successfully added, hence we use add() if we wish to interrupt program if element not added

        System.out.println(queue);
        System.out.println(queue.peek());   // peek() is used to see the first most element in queue(head of queue) and returns null if queue is empty.
        System.out.println(queue.poll());   // poll() method is used to remove elements from queue, returns null if queue is empty.
        System.out.println(queue);
        System.out.println(queue.element());   // alternative of peek() is element() which throws an exception if queue is empty.
        System.out.println(queue.remove());   // alternative of poll() method is remove() which throws an exception if queue is empty.


        // LinkedList using List Interface

        List<Integer> l2 = new LinkedList<>();

        l2.add(3);   // as soon as an element is added to array l1 the array size becomes 10
        l2.add(2);   // when 11th element is added array size increase as given - * new size = (current size + current size/2 + 1) an this process repeats whenever array size needs to be increased
        l2.add(4);
        l2.add(6);
        l2.add(7);
        l2.add(0,5);
        l2.add(0,9);

        System.out.println(l2);     // whenever some object is written inside 'sout()' the toString() method of the class of that object gets invoked

        System.out.println(l2.get(2));   // --> getting element at index 2

        ArrayList<Integer> l3 = new ArrayList<>(5);
        l2.add(13);
        l2.add(14);
        l2.add(15);


        l2.addAll(3,l3);

        System.out.println(l2);

        System.out.println(l2.contains(16));
        System.out.println(l2.contains(15));

        System.out.println(l2.indexOf(15));
        System.out.println(l2.indexOf(276));

        l2.set(0,36);
        System.out.println(l2);

//        l2.clear();
//        for(int ele:l1){
//            System.out.println(ele+"   ");
//        }
//        System.out.println("cleared");


        l2.remove(3);
        System.out.println(l2);

        l2.remove(Integer.valueOf(14));
        System.out.println(l2);

        System.out.println(l2.size());

        // for iterating through ArrayList -

        for(int i = 0;i<l2.size();i++){     // iterating using index
            System.out.print(l2.get(i)+"   ");
        }
        System.out.println("\n");

        for(Integer ele: l2){        // iterating using for each loop (most recommended for iterating)
            System.out.print(ele+"   ");
        }
        System.out.println("\n");

        Iterator<Integer> it = l2.iterator();  // iterating using Iterator

        while(it.hasNext()){
            System.out.println("Iterator value "+it.next());
        }

        LinkedList<Integer> a = new LinkedList<>();
        a.add(8);
        a.add(3);
        a.add(5);
        a.add(7);
        a.addLast(78);
        a.add(56);
        a.add(3);
        a.addFirst(2);
        System.out.println(a);

    }
}
