package com.company.Section11;

/*
Задание 11.42
Напишите класс, который выводит на экран все целые трехзначные
числа (и положительные, и отрицательные), соответствующие следующему
 требованию: эти числа делятся без остатка на сумму собственных цифр.
 */
public class Task42 {
    public static void main(String[] args) {
        int a1, a2, a3, summ;
        for (int i = -999; i <= 999; i++) {
            a1 = i / 100;
            a2 = (i % 100) / 10;
            a3 = i / 10;
            summ = a1 + a2 + a3;
            if (summ != 0)
                System.out.print(i % summ == 0 ? i + " " : "");
        }
    }
}
