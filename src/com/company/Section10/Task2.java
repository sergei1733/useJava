package com.company.Section10;

import java.lang.Math;

/*
Задание 10.2
Напишите класс, который генерирует и выводит на экран 2 случайных
целых числа из диапазона «однозначные» (включая и положительные,
и отрицательные).
После этого в отдельной строке класс должен вывести наибольшее из
этих двух чисел - с соответствующим текстовым сообщением.
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b, down = -10, up = 10;
        double c;
        a = down + (int) ((up - down + 1) * Math.random());
        b = down + (int) ((up - down + 1) * Math.random());
        System.out.println(a > b ? "первое число больше второго" : "второе число больше первого");
        System.out.println(a + "," + b);
    }
}
