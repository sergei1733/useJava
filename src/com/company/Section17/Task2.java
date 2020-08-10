package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.9
Напишите метод, который получает в качестве параметра два числа
(А и В) и выводит на экран все четные числа из диапазона А ... В.
 */
public class Task2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, x1;
        x = in.nextInt();
        x1 = in.nextInt();
        evenNambers(x, x1);
    }

    static void evenNambers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }
}
