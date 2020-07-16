package com.company.Section8;
        /*
        Задание 8.32
Напишите класс, который принимает с клавиатуры целое число, и затем:
• в случае если введено четное число, - принимает с клавиатуры
дробное число и выводит на экран произведение этих двух чисел;
• в противном случае - принимает с клавиатуры целое число и выводит
на экран сумму этих двух чисел.
*/

import java.util.Scanner;


public class Task32 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, a1, a2, a3;
        double k;
        System.out.print("введите число ");
        a = in.nextInt();

        if (a%2 == 0) {
            System.out.println("введите дробное число");
            k = in.nextDouble();
            System.out.println(a * k);
        } else{
            System.out.println("введите целое число");
            b = in.nextInt();
            System.out.println(a + b);
        }



      }
    }
