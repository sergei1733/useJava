package com.company.Section9;
        /*
    Задание 9.26
Назовем двузначное число «внутренним» по отношению к четырехзначному числу, если какая-то пара смежных
цифр в четырехзначном числе образует двузначное число. Напишите класс, который принимает с клавиатуры
два положительных числа - двузначное и четырехзначное - и проверяет, является ли двузначное «внутренним»
по отношению к четырехзначному.
*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Task26 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, b;
        a = in.nextInt();
        b = in.nextInt();
        a1 = a / 100;
        a2 = a % 100;

        System.out.println((a1 == b || a2 == b) ? "является" : "не яляется");

    }
}
