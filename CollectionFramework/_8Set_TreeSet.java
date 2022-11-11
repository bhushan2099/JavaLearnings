package com.CollectionsFramework;

import java.util.TreeSet;

public class _8Set_TreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set  = new TreeSet<>();   // TreeSet is based on Binary Search Tree

        // The elements entered in TreeSet get sorted in order (ascending)

        set.add(34);
        set.add(117);
        set.add(67);
        set.add(45);
        set.add(99);
        set.add(99);

        System.out.println(set);

        set.remove(67);
        System.out.println(set);

        System.out.println(set.contains(67));
        System.out.println(set.contains(78));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }
}
