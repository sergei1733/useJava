package com.company.Section9;
        /*
    Задание 9.13

Трехзначное число называется «опускающимся», если оно составлено
из цифр, расположенных в порядке убывания (наибольшая - первая,
наименьшая - последняя, все цифры разные; например, - 321).
Напишите класс, который принимает с клавиатуры трехзначное число
и проверяет, является ли оно «опускающимся». В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a / 100;
        a2 = (a - a1 * 100) / 10;
        a3 = a % 10;
        if (a1 > a2 && a2 > a3)
            System.out.println("число опускающееся");
        else
            System.out.println("не опускается");


    }
}
