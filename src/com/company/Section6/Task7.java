package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры целое положительное число и,
        если оно как минимум трехзначное и положительное, уменьшает его на 1.
*/

import java.util.Scanner;


public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = in.nextInt();
        if (a >= 100)
        {a = a - 1;
        System.out.println(a);}



    }
}