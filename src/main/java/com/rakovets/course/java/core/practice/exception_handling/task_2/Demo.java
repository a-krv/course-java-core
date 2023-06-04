package com.rakovets.course.java.core.practice.exception_handling.task_2;

public class Demo {
    public static void main(String[] args) {
        try {
            Task.getException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
