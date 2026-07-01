package com.example.springcore;

public class Student {

    private int id;
    private String name;
    private String department;

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("Student Details");
        System.out.println("------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}
