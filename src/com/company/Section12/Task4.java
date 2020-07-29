package com.company.Section12;

import java.util.Scanner;

/*
Задание 12.4
Напишите класс, который принимает с клавиатуры 17 целых чисел и
выводит на экран информацию о том, сколько из них были больше,
чем предыдущее число.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a, count = 0;
        a = in.nextInt();
        for (int i = 1; i <= 17; i++) {
            x = in.nextInt();
            if (x > a)
                count++;
            a = x;
        }
        System.out.println(count);
    }
}
