package com.java.training;

import java.util.Objects;

public class Employee {

    private int rollNumber;

    private String name;

    public Employee(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return rollNumber == employee.rollNumber && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
