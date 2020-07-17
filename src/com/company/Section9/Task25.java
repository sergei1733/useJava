package com.company.Section9;
        /*
    Задание 9.25
Целое трехзначное число называется «ЯМОЙ», если его средняя цифра
меньше крайних.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и проверяет, является ли оно «ЯМОЙ».
*/

import java.util.Scanner;


public class Task25 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a / 100;
        a2 = (a - a1 * 100) / 10;
        a3 = a % 10;

        System.out.println(a2 < a1 && a2 < a3 ? "яма" : "не яма");


    }
}
