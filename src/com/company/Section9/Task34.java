package com.company.Section9;
import java.util.Scanner;
/*
Задание 9.34
Напишите класс, который читает с клавиатуры два символьных значения и проверяет, идентичны ли они.
По результатам проверки следует вывести на экран соответствующее
сообщение.
 */
public class Task34 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    char a,b;
    a = in.next().charAt(0);
    b = in.next().charAt(0);
        System.out.println(a==b?"да":"нет");
    }
}
