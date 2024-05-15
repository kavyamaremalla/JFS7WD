package com.java.training;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"john");
        employee.setName("Ana");
        System.out.println(employee);

        EmployeeRecord record = new EmployeeRecord(2, "Peter");
        //records are immutable by default
        System.out.println(record.name());
    }
}
