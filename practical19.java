package student;

public class Student {
    protected int rollNo;
    protected String name;
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
package exam;

import student.Student;

public class Result extends Student {
    int marks1, marks2, marks3;
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- MARK SHEET -----");
        displayStudent();
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
    public static void main(String[] args) {
        Result r = new Result(101, "Priya", 85, 90, 88);
        r.displayResult();
    }
}