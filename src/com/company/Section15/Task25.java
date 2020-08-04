package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.28
Напишите класс, который принимает с клавиатуры целое число и подсчитывает число цифр в
нем (количество цифр в числе).Результат подсчета должен быть выведен на экран. Например,
для числа 534 на экран будет выведено 3 цифры.
 */
public class Task25 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, count = 0, a;
        x = in.nextInt();
        while (x>0){
            x/=10;
            count++;
        }
        System.out.println(count+" цифры");

    }
}
