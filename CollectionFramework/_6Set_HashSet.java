package com.CollectionsFramework;

import java.util.HashSet;

public class _6Set_HashSet {

    // Duplicate elements are not allowed in a Set

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(34);   // every element has a Hash(eg. kdjajdkj) and this Hash is stored in Collection
        set.add(56);   // every element has a unique hash
        set.add(67);
        set.add(78);
        set.add(99);
        set.add(99);    // won't add 99 again as it has the same Hash as the 99 already add to the set rejects to add it

        System.out.println(set);    // the order in which elements are added to set is random because of Hashing
        // Hence set is unordered and non indexed

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
