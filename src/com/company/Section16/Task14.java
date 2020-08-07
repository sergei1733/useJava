package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.17
Напишите класс, который выводит на экран все простые двузначные
числа, квадрат которых не превышает 999.
 */
public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0, a;
        for (int i = 10; i<=99; i++){
            a = 0;
            count = 0;
            for (int j =1; j<=99;j++){
                if (i%j==0)
                    count++;
            }
            if (count==2) {
                a = i * i;
                System.out.println(a < 999 ? a + " " + i : "");
            }
        }
    }
}

