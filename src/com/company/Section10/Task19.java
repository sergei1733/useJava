package com.company.Section10;

import java.lang.Math;

/*
Задание 10.19
Напишите класс, который генерирует и выводит на экран последовательность из 5 случайных целых
чисел из диапазона от -50 до 50.
Класс должен определить, сколько раз в этой последовательности менялся знак.
Например: в последовательности 1, -34, 8, 14, -5 знак меняется 3 раза.
 */
public class Task19 {
    public static void main(String[] args) {
        int start = -50, end = 50, a1, a2, a3, a4, a5, k = 0;

        a1 = start + (int) ((end - start + 1) * Math.random());
        a2 = start + (int) ((end - start + 1) * Math.random());
        a3 = start + (int) ((end - start + 1) * Math.random());
        a4 = start + (int) ((end - start + 1) * Math.random());
        a5 = start + (int) ((end - start + 1) * Math.random());

        if (a1 * a2 < 0) k++;
        if (a2 * a3 < 0) k++;
        if (a3 * a4 < 0) k++;
        if (a4 * a5 < 0) k++;
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
        System.out.println(k);
    }
}
