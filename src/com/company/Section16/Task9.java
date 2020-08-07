package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.12
Напишите класс, который находит натуральное число от 1 до 10000 с
максимальной суммой делителей.
 */
public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, max = 0;
        n=in.nextInt();
        for (int i=1;i<=n; i++){
            int summ = 0;
            for (int j=1; j<=i/2;j++){
                if (i%j==0)summ += j;
            }
            if (summ> max) max = summ;
        }
        System.out.println(max);
    }
}
