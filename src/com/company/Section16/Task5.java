package com.company.Section16;
/*
Задание 16.8
Напишите класс, который будет выводить на экран суммы делителей
каждого числа от 1 до 75
 */

import javax.swing.*;

public class Task5 {
    public static void main(String[] args) {

        for (int i = 1; i<=75; i++){
            int summ = 0;
            System.out.print("сумма делителей числа "+i+" /- ");
            for (int j = 1; j<=i/2; j++){
                if (i%j==0) {
                    System.out.print(j+" ");
                    summ +=j;
                }
            }
            System.out.println("    "+summ);
        }
    }
}
