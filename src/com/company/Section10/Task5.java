package com.company.Section10;

import java.lang.Math;

/*
Задание 10.5
Напишите класс, который генерирует случайное положительное двузначное число,
 а затем генерирует три целых положительных числа,меньших первого.
 */
public class Task5 {
    public static void main(String[] args) {
        int start = 10, end = 99, a, b, c, d;
        d = start + (int) ((end - start + 1) * Math.random());
        System.out.println(d);
        a = start + (int) ((d - start) * Math.random());
        b = start + (int) ((d - start) * Math.random());
        c = start + (int) ((d - start) * Math.random());
        System.out.println(a + " " + c + " " + b);


    }
}
