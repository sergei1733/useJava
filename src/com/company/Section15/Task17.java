package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.19
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел, для каждого
введенного числа класс напечатает сумму его цифр.
 */
public class Task17 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, summ = 0,a;

        for (int i = 1; i<=15; i++){
            x = in.nextInt();
            while (x>0){
              a = x%10;
              summ +=a;
              x = x/10;
            }
            System.out.println("сумма цифр " + i + " ого числа равна " + summ);
            summ = 0;
        }
    }
}
