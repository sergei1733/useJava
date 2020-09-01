package com.company.exception.exception3;

public class Exception {
    public static void main(String[] args) {
        //unchecked
        int a = 1/0;
        //-------------------------
        String name = null;
        System.out.println(name);
        //-------------------------
        int[] array = new int[5];
        System.out.println(array[5]);
    }
}
