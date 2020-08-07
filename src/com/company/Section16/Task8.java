package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.11
Напишите класс, который принимает с клавиатуры целое число, а затем проверяет,\
 можно ли представить его в виде суммы квадратов двух
целых чисел.
 */
public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n,k=0;
        n = in.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i; j++){
               if (i*i+j*j==n) k=1;
            }
        }
        System.out.println(k==1?"да":" нет");
    }
}
