package com.company.Section12;

import java.util.Scanner;

/*
Задание 12.6
Напишите класс, который принимает с клавиатуры целое число и проверяет, на какое количество
двузначных чисел оно делится. Результат проверки класс должен вывести на экран вместе с
соответствующим текстовым сообщением.
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0, x;
        x = in.nextInt();
        for (int i = 10; i <= 99; i++) {
            if (x % i == 0)
                count++;
        }
        System.out.println(count);
    }

}
