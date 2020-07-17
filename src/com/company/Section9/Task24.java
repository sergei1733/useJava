package com.company.Section9;
        /*
    Задание 9.24
Целое трехзначное число называется «горой», если его средняя цифра
больше крайних.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и проверяет, является ли оно «горой».
*/

import java.util.Scanner;


public class Task24 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = a%10;

        System.out.println(a2>a1 && a2>a3 ? "гора":"не гора");



    }
}
