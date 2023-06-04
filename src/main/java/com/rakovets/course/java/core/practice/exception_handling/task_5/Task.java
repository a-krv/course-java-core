package com.rakovets.course.java.core.practice.exception_handling.task_5;

import com.rakovets.course.java.core.practice.exception_handling.task_5.exception.MyException;

public class Task {
    public static void getException() throws NullPointerException, MyException {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw new MyException(e.getMessage());
        }
    }
}
