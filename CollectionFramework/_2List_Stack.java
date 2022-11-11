package com.CollectionsFramework;

import java.util.Stack;

public class _2List_Stack {

    // Stack is LIFO --> 'Last In First Out' kind of data structure

    public static void main(String[] args) {

        Stack<String > animals = new Stack<>();
        animals.push("Lion");    // --> push means to add an element to stack
        animals.push("Tiger");
        animals.push("Cheetah");
        animals.push("Bear");

        System.out.println("Stack : "+animals);

        System.out.println(animals.peek());   // --> peek means to see from top

        animals.pop();   // pop deletes the top most element from stack

        System.out.println("Stack : "+animals);

        System.out.println(animals.peek());



    }
}
