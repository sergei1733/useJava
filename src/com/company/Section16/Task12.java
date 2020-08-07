package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.15
Напишите класс, который выводит на экран все простые трехзначные числа.
Класс также должен определить количество и сумму этих чисел.
 */
public class Task12 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0, k = 0, summ = 0,a;
        for (int i = 100; i<=999; i++){
            k=0;
            for (int j = 1; j<=999;j++){
                if (i%j==0) k++;
            }
            if (k==2){
                System.out.print(i+" ");
                summ+=i;
                count++;
            }
        }
        System.out.println();
        System.out.println("кол во " + count + " сумма "+ summ);
    }
}
