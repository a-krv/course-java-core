package com.rakovets.course.java.core.practice.exception_handling.task_1;

public class Task {
    public static void pt() throws NullPointerException {
        String nullString = null;
        nullString.substring(6);
    }
}
