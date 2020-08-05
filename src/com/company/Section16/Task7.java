package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.10
Целое число называется <<Полноценным», если сумма делителей (включая 1, но,
 не включая само число) числа равна самому числу.
Напишите класс, который выводит на экран все «полноценные» числа ОТ 1 ДО 100000
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, summ = 0;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            summ = 0;
            for (int j = 1; j <= i-1; j++) {
                if (i % j == 0)
                    summ += j;
            }
            if (i == summ) System.out.println(i + " " + summ);
        }
    }
}
