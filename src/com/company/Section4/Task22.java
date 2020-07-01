package com.company.Section4;
        /*
    Назовем «сдвигом числа вправо по кругу» операцию, при которой все
    цифры числа сдвигаются вправо, а число единиц (последняя цифра)
    перемещается в старший разряд числа (первая цифра).
    Например, из числа 1234 получается число 4123.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «сдвигом вправо по кругу».

         */

import java.util.Scanner;


public class Task22 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a % 10;
        a2 = a1 * 100 + a / 10;

        System.out.println(a2);


    }
}