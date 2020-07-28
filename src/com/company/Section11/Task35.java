package com.company.Section11;

import java.util.Scanner;

/*
Задание 11.35
81
Напишите класс, который принимает с клавиатуры целое число и выводит на экран 25
последующих ему нечетных чисел.
 */
public class Task35 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        for (int i = 1; i<=25; ){
            x++;
            if (x%2!=0) {
                System.out.print( x + " ");
                i++;
            }
        }
    }
}
