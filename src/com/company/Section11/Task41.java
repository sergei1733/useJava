package com.company.Section11;

/*
Задание 11.41
Напишите класс, который выводит на экран целые положительные
трехзначные числа, составленные целиком из четных цифр.
 */
public class Task41 {
    public static void main(String[] args) {
        int a1, a2, a3;
        for (int i = 100; i <= 999; i++) {
            a1 = i / 100;
            a2 = (i % 100) / 10;
            a3 = i % 10;
            System.out.print(a1 % 2 == 0 && a2 % 2 == 0 && a3 % 2 == 0 ? i + " " : "");
        }
    }
}