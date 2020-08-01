package com.company.Section14;

import java.lang.Math;

/*
Задание 14.3
Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет наибольшее и наименьшее значение в сгенерированной серии.
 */
public class Task2 {
    public static void main(String[] args) {
        int start = -40, end = 40, min, max, x, x1;
        min = start + (int) ((end - start + 1) * Math.random());
        max = start + (int) ((end - start + 1) * Math.random());
        System.out.println(min+" "+max);
        for (int i = 1; i <= 10; i++) {
            x = start + (int) ((end - start + 1) * Math.random());
            if (x < min) min = x;
            if (x > max) max = x;
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(min+" "+max);
    }
}
