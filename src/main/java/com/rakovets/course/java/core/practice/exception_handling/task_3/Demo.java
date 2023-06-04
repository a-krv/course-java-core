package com.rakovets.course.java.core.practice.exception_handling.task_3;

import com.rakovets.course.java.core.practice.exception_handling.task_3.exception.NumberException;

public class Demo {
    public static void main(String[] args) throws NumberException {
        try {
            Task.getNumber();
            throw new NumberException();
        } catch (NumberException e) {
            e.printStackTrace();

        }
    }
}
