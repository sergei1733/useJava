package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.14
Напишите класс, который выводит на экран все простые двузначные числа.
Класс также должен определить количество и сумму этих чисел.
 */
public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int k=0, summ= 0;
        for (int i = 10; i<=99; i++){
            int count = 0;
            for (int j = 1; j<=99;j++){
                if (i%j==0) count++;
            }
           if (count==2) {
               k++;
               summ += i;
               System.out.print(" " + i);
           }
        }
        System.out.println();
        System.out.println("количество = "+k + " сумма "+ summ);
    }
}
