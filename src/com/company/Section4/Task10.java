package com.company.Section4;
        /*
    Назовем «весом числа>> сумму· его цифр.
    Напишите класс, который принимает с клавиатуры число (трехзначное)
    и выводит на экран его «вес».
         */

import java.util.Scanner;

public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, a4;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = (a-a1*100)%10;
        System.out.println(a1 + a2+ a3);
    }
}