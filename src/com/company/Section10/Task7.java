package com.company.Section10;

import java.lang.Math;

/*
Задание 10.7
Напишите класс, который генерирует два случайных положительных двузначных
 числа, обозначающих границы некоторого интервала, а затем
генерирует три целых положительных числа внутри данного интервала.
 */
public class Task7 {
    public static void main(String[] args) {
        int start = 10, end = 99, a, b, s1, s2, s3;
        a = start + (int) ((end - start + 1) * Math.random());
        b = start + (int) ((end - start + 1) * Math.random());
        if (a > b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
        s1 = start + (int) ((end - start + 1) * Math.random());
        s2 = start + (int) ((end - start + 1) * Math.random());
        s3 = start + (int) ((end - start + 1) * Math.random());
        System.out.println("ночало " + a + " " + b);
        System.out.println("начало " + start + " " + end);
        System.out.println(s1 + " " + s2 + " " + s3);
    }
}
