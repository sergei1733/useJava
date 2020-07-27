package com.company.Section10;

import java.lang.Math;

/*
Задание 10.20
Напишите класс, который генерирует и выводит на экран сначала случайное положительное однозначное
 число (цифру), а затем - случайное целое трехзначное.
Класс должен определить разницу между сгенерированной цифрой и
наибольшей цифрой сгенерированного случайного трехзначного числа.
 */
public class Task20 {
    public static void main(String[] args) {
        int start = 1, end = 10, a, b, b1, b2, b3, max = 0, c;
        a = start + (int) (end * Math.random());
        System.out.println(a);
        start = 100;
        end = 999;
        b = start + (int) ((end - start + 1) * Math.random());
        System.out.println(b);
        b1 = b / 100;
        b2 = b % 100 / 10;
        b3 = b % 10;
        System.out.println(b1 + " " + b2 + " " + b3);
        if (b1 > b2 && b1 > b3) max = b1;
        if (b2 > b1 && b2 > b3) max = b2;
        if (b3 > b1 && b3 > b2) max = b3;

        if (max > a)
            c = max - a;
        else
            c = a - max;
        System.out.println("разница = " + c);


    }
}
