package com.company.Section4;
        /*
    Напишите класс, который выполняет «сдвиг влево по кругу» для четырехзначного числа.
         */

import java.util.Scanner;


public class Task21 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a % 1000;
        a2 = a / 1000;
        a3 = a1 * 10 + a2;
        System.out.println(a3);


    }
}