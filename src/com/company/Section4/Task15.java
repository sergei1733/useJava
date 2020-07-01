package com.company.Section4;
        /*
    Напишите класс, который принимает с клавиатуры положительное
    четырехзначное число, а затем вычисляет и выводит на экран его «степень четности».
         */

import java.util.Scanner;

public class Task15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, s=0, a3, a4;
        a = in.nextInt();
        a1 = a/1000;
        a2 = a%1000/100;
        a3 = a%100/10;
        a4 = a%10;
        if (a1%2==0) s++;
        if (a2%2==0) s++;
        if (a3%2==0) s++;
        if (a4%2==0) s++;
        System.out.println(s);


    }
}