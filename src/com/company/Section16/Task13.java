package com.company.Section16;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Задание 16.16
Напишите класс, который выводит на экран все положительные четные двузначные числа, сумма делителей которых
тоже является четным числом.
 */
public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b, summ = 0;
        for (int i = 10; i<=98; i+=2){
            summ = 0;
            for (int j = 1; j<=98; j++){
                if (i%j==0) summ+=j;
            }
            if (summ%2==0) System.out.println("число " + i + " сумма "+ summ+" ");
        }

    }
}
