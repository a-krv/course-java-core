package com.rakovets.course.java.core.practice.exception_handling.task_1;

public class Demo {
    public static void main(String[] args) {
        try {
            Task.pt();
        } catch (Exception e) {
            System.out.print("Stroka soderjit ");
            System.out.println(e.getMessage());
        }
    }
}
