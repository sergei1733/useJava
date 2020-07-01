package com.company.Section4;
        /*
    Напишите класс, который выполняет «сдвиг вправо по кругу» для четырехзначного числа.
         */

import java.util.Scanner;


public class Task23 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a % 10;
        a2 = a1 * 1000 + a / 10;
        System.out.println(a2);


    }
}