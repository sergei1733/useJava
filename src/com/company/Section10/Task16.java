package com.company.Section10;

import java.lang.Math;

/*
Задание 10.16
Напишите класс, который генерирует и выводит на экран два случайных числа из диапазона от 17 до 94.
Класс должен проверить, какое из двух чисел, первое или второе, было
больше, и вывести на экран соответствующее текстовое сообщение.
Кроме того, класс должен определить наименьшую цифру из всех фигурирующих в этих числах и
 вывести на экран соответствующее текстовое сообщение.
 */
public class Task16 {
    public static void main(String[] args) {
        int start = 17, end = 94, a, b, a1, a2, b1, b2;
        a = start + (int) ((end - start + 1) * Math.random());
        b = start + (int) ((end - start + 1) * Math.random());
        System.out.println(a + " " + b);
        System.out.println(a > b ? "первое больше " + a : "второе больше " + b);

        a1 = a / 10;
        a2 = a % 10;
        b1 = b / 10;
        b2 = b % 10;
        System.out.println(a1 + " " + a2 + " " + b1 + " " + b2);
        System.out.print(a1 < a2 && a1 < b1 && a1 < b2 ? "наименьшее число " + a1 : "");
        System.out.print(a2 < a1 && a2 < b1 && a2 < b2 ? "наименьшее число " + a2 : "");
        System.out.print(b1 < a2 && b1 < a1 && b1 < b2 ? "наименьшее число " + b1 : "");
        System.out.print(b2 < a2 && b2 < b1 && b2 < a1 ? "наименьшее число " + b2 : "");

    }
}
