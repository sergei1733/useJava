package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.18
Напишите класс, который принимает с клавиатуры целое число и выводит на экран все числа,
 которые можно получить из введенного за счет «стирания последней цифры». Например, для
 введенного числа 52435 будут выведены на экран 5243, 524, 52, 5, О.
 */
public class Task16 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a;
        x = in.nextInt();
        while (x>0){
            a = x/10;
            x = x/10;
            System.out.println(a);

        }
    }
}
