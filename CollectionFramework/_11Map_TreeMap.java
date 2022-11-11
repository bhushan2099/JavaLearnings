package com.CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;

public class _11Map_TreeMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();     // TreeMap uses Binary Search Tree hence it sort the map on the basis of keys

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);    // as the keys are String datatype it gets sorted in alphabetical order

//        numbers.put("Two",22);    // this will get overridden

        // Hence use 'if condition' to put values using key
        if(!numbers.containsKey("Two")){
            numbers.put("Two",22);
        }

        numbers.putIfAbsent("Two",22);   // works same as 'if condition' mentioned above

        System.out.println(numbers);      // Map is unordered hence printed randomly
        System.out.println(numbers.get("One"));
        System.out.println(numbers.get("Two"));

        // to iterate in a Map following method is used -
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(numbers.keySet());
        System.out.println(numbers.values());

        // Other way to iterate the Map -
        for(String key:numbers.keySet()){
            System.out.println(numbers.get(key));
        }
    }
}
