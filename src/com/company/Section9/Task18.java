package com.company.Section9;
        /*
    Задание 9.18
Напишите класс, который принимает с клавиатуры три числа и проверяет, являются ли эти числа длинами
сторон одного и того же треугольника. По результатам проверки следует вывести на экран соответствующее
текстовое сообщение.
*/

import java.util.Scanner;


public class Task18 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(a + b > c && a+c>b && c+b>a  ? "Является" : "не является");


    }
}
