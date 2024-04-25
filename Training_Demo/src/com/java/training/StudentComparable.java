package com.java.training;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable implements Comparable<StudentComparable> {

    int rollNum;

    String name;

    int age;

    public StudentComparable(int rollNum, String name, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparable studentComparable) {
        if (age == studentComparable.age) {
            return 0;
        } else if (age > studentComparable.age) {
            return 1;
        }return -1;
    }
}

//Create a test class
class TestSort1{

    public static void main(String[] args) {
        ArrayList<StudentComparable> studentComparableList = new ArrayList<>();

        studentComparableList.add(new StudentComparable(101, "John", 21));
        studentComparableList.add(new StudentComparable(103, "Potter", 23));
        studentComparableList.add(new StudentComparable(102, "Harry", 24));


        Collections.sort(studentComparableList);


        for (StudentComparable stu : studentComparableList) {
            System.out.println(stu.rollNum + " " + stu.name + " " + stu.age);
        }




    }
}