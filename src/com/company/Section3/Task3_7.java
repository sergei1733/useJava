package com.company.Section3;
        /*
       Напишите класс, который принимает с клавиатуры целое число и выводит
       на экран три предыдущих ему целых числа, причем каждое - в
       отдельной строке.
         */

import java.util.Scanner;

public class Task3_7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        System.out.print("введите число ");
        a = in.nextInt();
        a1=a-1;
        a2=a1-1;
        a3=a2-1;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}