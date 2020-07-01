package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры целое положительное
    двузначное число и выводит на экран его цифры, разделенные
    знаком «пробел», но в обратном порядке. То есть для числа 45 будет
    выведено на экран 5 4
         */

import java.util.Scanner;

public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
        a = in.nextInt();
        a1 = a % 10;
        a2 = a / 10;

        System.out.println(a1 + " " + a2);
    }
}