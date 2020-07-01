package com.company.Section4;
        /*
    Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного числа.
         */

import java.util.Scanner;


public class Task19 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
        a = in.nextInt();
        a1 = a % 1000;
        a2 = a1 * 10;
        System.out.println(a2);


    }
}