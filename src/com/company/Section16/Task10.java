package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.13
Два положительных трехзначных числа а и Ь называются «родственными», если сумма делителей числа а равна
Ь, а сумма делителей числа Ь равна а. Например, это числа 220 и 284, так как сумма делителей 220
равна 284, а сумма делителей 284 равна 220.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и ищет ближайшее к нему и большее него «родственное» число.
 */
public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c, summA = 0, summB=0;
        a = in.nextInt();

        for (int i = 1; i<=a/2;i++){
            if (a%i==0) summA +=i;
        }
        System.out.println(summA);
        for (int i=1; i<=summA/2;i++){
            if (summA%i==0) summB +=i;
        }
        System.out.println(summB);
        if (a==summB)
        System.out.println("числа родственные");
    }
}
