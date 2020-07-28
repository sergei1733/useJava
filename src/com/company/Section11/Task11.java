package com.company.Section11;

import java.lang.Math;

/*
Задание 11.11
Напишите класс, который выводит на экран (в одну строку) 11 случайных чисел из
диапазона «положительные двузначные». После каждого
числа, делящегося на 5 без остатка, следует вывести (в обычных скобках,
вплотную к числу) сумму его цифр; для остальных чисел следует вывести
произведение его цифр (в квадратных скобках, вплотную к числу).
 */
public class Task11 {
    public static void main(String[] args) {
        int start = 10, end = 99, a, a1, a2, b, c;
        for (int i = 1; i <= 11; i++) {
            a = start + (int) ((end - start + 1) * Math.random());
            a1 = a / 10;
            a2 = a % 10;
            if (a % 5 == 0) System.out.print(a + " (" + (a1 + a2) + ") ");
            else
                System.out.print(a + " (" + (a1 * a2) + ") ");

        }

    }
}
