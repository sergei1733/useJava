package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.2 S
Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х). Затем класс выводит на экран в
строку все целые числа из диапазона O ... lxl (включая крайние значения
диапазона). Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */
public class Task25 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a;
        x = in.nextInt();
        for (int i=0; i<=x;i++){
            System.out.println(i+" ");
        }
    }
}
