package com.java.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

    int rollNum;

    String name;

    int age;

    public Student(int rollNum, String name, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.age = age;
    }

}

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else return -1;
    }
}
class NameComparator implements Comparator<Student>{

        public int compare(Student s1, Student s2) {
          return s1.name.compareTo(s2.name);
        }
}

class TestComparator{
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "John", 21));
        studentList.add(new Student(103, "Potter", 23));
        studentList.add(new Student(102, "Harry", 22));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(190);
        numbers.add(234);
        numbers.add(100);

        System.out.println("Normal sort");
        Collections.sort(numbers);
        for (Integer i : numbers){
            System.out.println(i);
        }

        System.out.println("Sort by name : " );
        Collections.sort(studentList, new NameComparator());
        for (Student stu : studentList) {
            System.out.println(stu.rollNum + " " + stu.name + " " + stu.age);
        }

        Collections.sort(studentList, new AgeComparator());
        System.out.println("Sort by age : " );
        for (Student stu : studentList) {
            System.out.println(stu.rollNum + " " + stu.name + " " + stu.age);
        }

    }
}
