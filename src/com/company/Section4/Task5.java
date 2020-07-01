package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры целое положительное двузначное
    число и выводит его на экран в «полном виде»: например, для числа 34 это
    будет выглядеть как 30+4.
         */

import java.util.Scanner;

public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
        a = in.nextInt();
        a1 = a - (a % 10);
        a2 = a % 10;
        System.out.println(a1 + "+" + a2);
    }
}