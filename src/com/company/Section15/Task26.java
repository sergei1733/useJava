package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.31
Напишите класс, который принимает с клавиатуры серию целых чисел
до тех пор, пока количество четных чисел в серии остается меньше 5.
 */
public class Task26 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a = 0;
        while (a <= 5) {
            x = in.nextInt();
            if (x % 2 == 0)
                a++;
        }


    }
}
