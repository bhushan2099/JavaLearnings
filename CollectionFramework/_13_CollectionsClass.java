package com.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _13_CollectionsClass {

    // Collections class is built on top of collection framework. Collection class provides static methods for providing functionality to the objects of Collection Framework.

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(3);
        al.add(5);
        al.add(1);
        al.add(6);
        al.add(2);
        al.add(9);
        al.add(4);
        al.add(9);
        al.add(10);
        al.add(9);

        System.out.println(al);
        System.out.println("Min element - "+Collections.min(al));
        System.out.println("Max element - "+Collections.max(al));
        System.out.println("9 in al occurs - "+Collections.frequency(al,9)+" times");

        Collections.sort(al);
        System.out.println(al);

        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);


        List<Student1> studentlist = new ArrayList<>();

        studentlist.add(new Student1(2,"NIRAJ"));
        studentlist.add(new Student1(1,"AAKASH"));
        studentlist.add(new Student1(5,"ROHIT"));
        studentlist.add(new Student1(4,"DHANU"));

        System.out.println(studentlist);

        Collections.sort(studentlist);       // Collections.sort uses compareTo()  which is present inside Comparable interface
        // hence we have to implement Comparable interface in our Student1 class

        System.out.println(studentlist);

        Student1 s11 = new Student1(2,"NIRAJ");
        Student1 s12 = new Student1(1,"AAKASH");

        System.out.println(s11.compareTo(s12));  // this ie s11 roll is larger than that ie s12 roll hence we get back positive integer in return


        // now suppose we do not want to sort the objects stored in list on the basis of Roll no but on th basis of Name.
        // to do that we can use Comparator -

        Collections.sort(studentlist,new Comparator<Student1>(){
            @Override
            public int compare(Student1 o1,Student1 o2){
                return o1.name.compareTo(o2.name);

            }
        });

        System.out.println(studentlist);     // sorted in alphabetical order of name





    }


}

