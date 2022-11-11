package com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

/*
List Interface is used when we want to store data in a contiguous fashion ie one after other (having index).

ArrayList class implements List interface.

ArrayList class internally uses Array. ArrayLists are based on the dynamically resizable arrays.

Due to the ease of insertions and deletions, they are preferred over the arrays.

Computational cost is high in ArrayList when an element is needed to be added in between in a large ArrayList.

 */

public class _1List_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); // --> when this line of code is written an empty array l1 is created (size 0)
        l1.add(3);   // as soon as an element is added to array l1 the array size becomes 10
        l1.add(2);   // when 11th element is added array size increase as given - * new size = (current size + current size/2 + 1) and this process repeats whenever array size needs to be increased
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(0,5);
        l1.add(0,9);

        System.out.println(l1);     // whenever some object is written inside 'sout()' the toString() method of the class of that object gets invoked

        System.out.println(l1.get(2));   // --> getting element at index 2

        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.addAll(3,l2);

        System.out.println(l1);

        System.out.println(l1.contains(16));
        System.out.println(l1.contains(15));

        System.out.println(l1.indexOf(15));
        System.out.println(l1.indexOf(276));

        l1.set(0,36);
        System.out.println(l1);

//        l1.clear();
//        for(int ele:l1){
//            System.out.println(ele+"   ");
//        }
//        System.out.println("cleared");


        l1.remove(3);
        System.out.println(l1);

        l1.remove(Integer.valueOf(14));
        System.out.println(l1);

        System.out.println(l1.size());

        // for iterating through ArrayList -

        for(int i = 0;i<l1.size();i++){     // iterating using index
            System.out.print(l1.get(i)+"   ");
        }
        System.out.println("\n");

        for(Integer ele: l1){        // iterating using for each loop (most recommended for iterating)
            System.out.print(ele+"   ");
        }
        System.out.println("\n");

        Iterator<Integer> it = l1.iterator();  // iterating using Iterator

        while(it.hasNext()){
            System.out.println("Iterator value "+it.next());
        }




//        More methods in Documentations

    }
}
