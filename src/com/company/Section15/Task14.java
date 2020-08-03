package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.16
Напишите класс, который принимает с клавиатуры целое число и выводит на экран количество
четных цифр в нем и сумму его нечетных цифр.
 */
public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, count = 0, summ = 0,a;
        x = in.nextInt();
        while (x>0){
            a = x%10;
            if (a%2==0)
                count++;
            else
                summ +=a;
            x = x/10;
        }
        System.out.println(count);
        System.out.println(summ);
    }
}
