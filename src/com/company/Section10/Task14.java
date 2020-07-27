package com.company.Section10;

import java.lang.Math;

/*
Задание 10.14
Напишите класс, который создает и выводит на экран 5 случайных целых чисел, заканчивающихся на
ноль, и принадлежащих к диапазону двузначных чисел
 */
public class Task14 {
    public static void main(String[] args) {
        int start = 10, end = 90, a, i = 5;
        while (i > 0) {
            a = start + (int) ((end - start + 1) * Math.random());
            if (a % 10 == 0) {
                i--;
                System.out.println(a);
            }
        }

    }
}
