package com.CollectionsFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    public int roll;
    public String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {            // hashCode is being generated on the basis of roll No. hence if object have same roll no then only first one of them will be added to set
        return Objects.hash(roll);
    }
}

class Student1 implements Comparable<Student1>{
    public int roll;
    public String name;

    public Student1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return roll == student1.roll;
    }

    @Override
    public int hashCode() {            // hashCode is being generated on the basis of roll No. hence if object have same roll no then only first one of them will be added to set
        return Objects.hash(roll);
    }

    @Override
    public int compareTo(Student1 that) {   // returns positive int if roll of this object is greater than that and negative int if roll of this object is less than that
        return this.roll-that.roll;
    }


}

public class _9SetOfCustomClasses {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1,"NIRAJ"));     // adding objects of Student class in studentSet
        studentSet.add(new Student(5,"AAKASH"));
        studentSet.add(new Student(3,"DHANANJAY"));
        studentSet.add(new Student(3,"ROHIT"));

        System.out.println(studentSet);

        Student s1 = new Student(3,"DHANANJAY");
        Student s2 = new Student(3,"ROHIT");

        System.out.println(s1.equals(s2));
        /* we get TRUE as roll no is being compared in equals() method written inside Student object and s1 and s2 objects
        of Student have same roll numbers */





    }
}
