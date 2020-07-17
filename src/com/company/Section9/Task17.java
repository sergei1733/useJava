package com.company.Section9;
        /*
    Задание 9.17
Напишите класс, который принимает с клавиатуры три числа и проверяет, являются ли эти числа углами
одного и того же треугольника. По результатам проверки следует вывести на экран соответствующее
текстовое сообщение.
*/

import java.util.Scanner;


public class Task17 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(a + b + c == 180 ? "Является" : "не является");


    }
}
