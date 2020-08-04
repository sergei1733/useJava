package com.company.Section16;
/*
Задание 16. 7
Напишите класс, который будет выводить на экран делители каждого
числа от 1 до 75.
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i<=75; i++){
            System.out.print("делители числа "+ i + " /- ");
            for (int j = 1; j<=75;j++){
                if (i%j==0)System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
