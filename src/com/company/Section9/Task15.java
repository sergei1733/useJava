package com.company.Section9;
        /*
    Задание 9.15
Напишите класс, который принимает с клавиатуры целое число, которое должно означать порядковый номер месяца.
В случае если полученное значение действительно соответствует порядковому номеру
одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к
которому относится месяц.В случае если введенное значение не является порядковым номером месяца,
следует вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        if (a > 0 && a <= 12) {
            if (a == 1 || a == 2 || a == 12) System.out.println("зима");
            else if (a >= 3 && a <= 5) System.out.println("весна");
            else if (a >= 6 && a <= 8) System.out.println("Лето");
            else System.out.println("осень");
        } else System.out.println("не правильное число");


    }
}
