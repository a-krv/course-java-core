package com.rakovets.course.java.core.practice.exception_handling.task_5;

import com.rakovets.course.java.core.practice.exception_handling.task_5.exception.MyException;

public class Demo {
    public static void main(String[] args) throws NullPointerException, MyException {
        try {
            Task.getException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
