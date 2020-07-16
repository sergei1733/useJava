package com.company.Section8;
        /*
Задание 8.29
Напишите класс, который принимает с клавиатуры две пары целых
ненулевых чисел: первая пара является числителем и знаменателем одной дроби,
вторая пара - числителем и знаменателем другой дроби.
Класс должен проверить, равны ли эти дроби друг другу, и вывести на
экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task29 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,b1,c1;
        double k;
        System.out.print("введите числители ");
        a = in.nextInt();
        a1 = in.nextInt();
        System.out.print("введите знаменатели ");
        b = in.nextInt();
        b1 = in.nextInt();

        c = a/a1;
        c1 = b/b1;

        if (c == c1) System.out.println("равны");
        else System.out.println("не равны");




      }
    }
