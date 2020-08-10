package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.12
Напишите метод, который принимает в качестве параметра целое число и
возвращает самую большую цифру в этом числе.
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        System.out.println(maxNumber(x));
    }

    public static int maxNumber(int a) {
        int max = 0, s, b;
        while (a > 0) {
            s = a % 10;
            a /= 10;
            if (s > max) max = s;
        }
        return max;
    }
}
