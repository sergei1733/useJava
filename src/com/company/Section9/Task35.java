package com.company.Section9;
import java.util.Scanner;
/*
Задание 9.35
Напишите класс, который читает с клавиатуры символ и проверяет,
является ли введенный символ буквой латинского алфавита. По результатам проверки следует
вывести на экран соответствующее сообщение.
 */
public class Task35 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char a,b;
        a = in.next().charAt(0);
        System.out.println(a>='A'&&a<='Z'?"да":"нет");
    }
}
