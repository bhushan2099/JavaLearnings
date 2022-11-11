package com.CollectionsFramework;

import java.util.LinkedHashSet;

public class _7Set_LinkedHashSet {

    // LinkedHashSet implements properties of Set as well as of the LinkedList

    // In LinkedHashSet the order in which elements are displayed is same as the order in which elements are entered

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(34);
        set.add(56);
        set.add(67);
        set.add(78);
        set.add(99);
        set.add(99);

        System.out.println(set);

        set.remove(67);
        System.out.println(set);

        System.out.println(set.contains(67));
        System.out.println(set.contains(78));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        for(Integer ele:set){
            System.out.println(ele);
        }

        set.clear();

        System.out.println(set);


    }
}
