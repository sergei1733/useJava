package com.company.Section16;
/*
Задание 16.5
Напишите класс, который выводит на экран:
в первой строке все четные двузначные числа,
во второй строке - двузначные числа, делящиеся на 3 без остатка,
в третьей строке - двузначные числа, делящиеся на 4 без остатка,
и так далее.
 */
public class Task2 {
    public static void main(String[] args) {
        int x;
        for (int i = 2; i <= 9; i++) {

            for (int j = 10; j <= 99; j++) {
                if (j % i == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
