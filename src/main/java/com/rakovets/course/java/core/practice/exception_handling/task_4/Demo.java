package com.rakovets.course.java.core.practice.exception_handling.task_4;

import com.rakovets.course.java.core.practice.exception_handling.task_4.exception.MyRuntimeException;

public class Demo {
    public static void main(String[] args) throws MyRuntimeException {
        try {
            Task.showText();
            throw new MyRuntimeException("ERROR");
        } catch (MyRuntimeException e) {
            e.printStackTrace();
        }
    }
}
