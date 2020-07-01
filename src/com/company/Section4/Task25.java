package com.company.Section4;
        /*
    Назовем «обменом» операцию, при которой два числа «обмениваются»
своими правыми цифрами.
Напишите класс, который принимает с клавиатуры два положительных
числа и совершает над ними операцию «обмена». Числа могут быть разной длинны.
         */

import java.util.Scanner;


public class Task25 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, b2, b, b1;
        a = in.nextInt();
        b = in.nextInt();
        a1 = a % 10;
        b1 = b % 10;
        a2 = a - a1 + b1;
        b2 = b - b1 + a1;
        System.out.println(a2);
        System.out.println(b2);


    }
}