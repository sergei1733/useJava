package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число, а затем вычисляет и выводит на экран его «степень
    четности».
         */

import java.util.Scanner;

public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3=0, a4;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a%100)/10;
        a4 = a%10;
        if (a1%2==0) a3++;
        if (a2%2==0) a3++;
        if (a4%2==0) a3++;
        System.out.println(a3);
    }
}