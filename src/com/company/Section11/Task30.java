package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.30
Напишите класс, который вначале принимает с клавиатуры целое положительное число.
Затем класс выводит на экран в строку положительные двузначные
числа, произведение цифр которых меньше введенного с клавиатуры
значения. Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */
public class Task30 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a,a1,a2,a3;
        x = in.nextInt();
        for (int i=10; i<=99;i++){
            a1 = i/10;
            a2 = i%10;
            a = a1*a2;
            System.out.print(a<x?i+" ":"");

        }

    }
}
