package com.company.Section10;

import java.lang.Math;

/*
Задание 10.18
Напишите класс, который генерирует и выводит на экран 3 случайных
целых положительных трехзначных числа.
Затем класс должен определить разницу между наибольшим и наименьшим из сгенерированных
чисел и вывести ее на экран вместе с соответствующим текстовым сообщением.
 */
public class Task18 {
    public static void main(String[] args) {
        int start = 100, end = 999, a1, a2, a3, b = 0, a = 0;
        a1 = start + (int) ((end - start + 1) * Math.random());
        a2 = start + (int) ((end - start + 1) * Math.random());
        a3 = start + (int) ((end - start + 1) * Math.random());
        if (a1 > a2 && a1 > a3) a = a1;
        if (a2 > a1 && a2 > a3) a = a2;
        if (a3 > a1 && a3 > a2) a = a3;

        if (a1 < a2 && a1 < a3) b = a1;
        if (a2 < a1 && a2 < a3) b = a2;
        if (a3 < a1 && a3 < a2) b = a3;

        System.out.println(a1 + " " + a2 + " " + a3);
        System.out.println("разница " + (a - b));


    }
}
