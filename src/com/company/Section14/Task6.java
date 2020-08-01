package com.company.Section14;

import java.lang.Math;

/*
Задание 14.7
Напишите класс, который генерирует 20 целых положительных двузначных чисел и выводит на экран число,
сумма цифр которого была максимальной.
 */
public class Task6 {
    public static void main(String[] args) {
        int start = 10, end = 99, a, a1, a2, max = 0, summ, x = 0;
        for (int i = 1; i <= 20; i++) {
            a = start + (int) ((end - start + 1) * Math.random());
            System.out.print(a + " ");
            a1 = a / 10;
            a2 = a % 10;
            summ = a1 + a2;
            if (summ > max) {
                max = summ;
                x = a;
            }

        }
        System.out.println();
        System.out.println(max + " " + x);
    }
}
