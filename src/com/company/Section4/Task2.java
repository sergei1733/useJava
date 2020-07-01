package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры целое положительное
    трехзначное число и выводит на экран его цифры, разделенные
    знаком «пробел».
         */

import java.util.Scanner;

public class Task2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,a1,a2,a3;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a%100)/10;
        a3 = (a%100)%10;
        System.out.println(a1 + " " + a2 + " " + a3);
    }
}