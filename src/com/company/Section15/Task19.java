package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.21
Напишите класс, который принимает с клавиатуры целое положительное число.
Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех
пор, пока не получится однозначное число. Все получающиеся значения следует вывести на экран.
 */
public class Task19 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a, summ = 0;
        x = in.nextInt();
        while (x>=10) {
            summ=0;
            while (x > 0) {
                a = x % 10;
                x = x / 10;
                summ += a;
            }
            x=summ;
            System.out.println(summ);
        }
    }
}
