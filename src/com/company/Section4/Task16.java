package com.company.Section4;
        /*
   Назовем «перестановкой» операцию над числом, при которой его первая и последняя
   цифры меняются местами. Например, из числа 1234 получается число 4231.
   Напишите программу, которая принимает с клавиатуры трехзначное число и строит из него
   новое число методом «перестановки».
         */

import java.util.Scanner;


public class Task16 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, a4;
        a = in.nextInt();
        a1 = a / 100;
        a2 = a % 100 / 10;
        a3 = a % 10;
        a4 = a3 * 100 + a2 * 10 + a1;
        System.out.println(a4);


    }
}