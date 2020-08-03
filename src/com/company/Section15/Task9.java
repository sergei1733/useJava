package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.11
Напишите класс, который принимает с клавиатуры пары двузначных
целых чисел, пока не будет введена пара одинаковых чисел.
Класс должен выводить на экран сумму всех первых чисел в парах и
сумму всех вторых чисел в парах (не считая чисел, введенных в последней паре).
 */
public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0, b = 0, summA = 0, summB = 0;
        do {
            summA += a;
            summB += b;
            a = in.nextInt();
            b = in.nextInt();
        } while (a != b);
        System.out.println("summ a "+summA);
        System.out.println("summ b "+summB);


    }
}
