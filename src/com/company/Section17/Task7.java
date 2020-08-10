package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.14
Напишите метод, который принимает в качестве параметра два целых
числа и возвращает среднее арифметическое сумм цифр в этих числах.
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(average(a, b));
    }

    public static int average(int x, int y) {
        int count = 0, summX = 0, summY = 0, sr;
        while (x > 0) {
            summX += x % 10;
            x /= 10;
            count++;
        }
        while (y > 0) {
            summY += y % 10;
            y /= 10;
            count++;
        }
        System.out.println(summX + " " + summY);
        sr = (summX + summY) / count;
        return sr;
    }
}
