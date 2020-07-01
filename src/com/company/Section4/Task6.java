package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число и выводит его на экран в «полном виде»: например,
    для числа 364 это будет выглядеть как 300+60+4.
         */

import java.util.Scanner;

public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a - (a % 100);
        a2 = (a - a1) - (a - a1) % 10;
        a3 = (a - a1) % 10;
        System.out.println(a1 + "+" + a2 + "+" + a3);
    }
}