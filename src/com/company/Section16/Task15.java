package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.18
Напишите класс, который принимает с клавиатуры целое положительное число и выводит на экран
все его делители, которые являются простыми числами.
 */
public class Task15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a=0,b, count=0;
        x = in.nextInt();
        for (int i = 1; i<=x; i++){
            if (x%i==0){
                count = 0;
                for (int j = 1; j<=i;j++){
                    if (i%j==0) count ++;
                }
                if (count==2)
                    System.out.println(i);
            }
            }
        }
    }

