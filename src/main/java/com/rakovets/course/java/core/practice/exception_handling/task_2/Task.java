package com.rakovets.course.java.core.practice.exception_handling.task_2;

import java.util.Arrays;

public class Task {
    public static void getException() throws IndexOutOfBoundsException {
        int[] myArray = new int[10];
        Arrays.copyOfRange(myArray,15, 20);
    }
}
