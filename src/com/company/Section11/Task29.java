package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.29
Напишите класс, который вначале принимает с клавиатуры целое положительное число.
Затем класс выводит на экран в строку положительные трехзначные
числа, в которых последняя цифра такая же, как и последняя цифра в
значении, введенном с клавиатуры. Числа должны отделяться друг от
друга знаком «пробел». Перед началом и после окончания вывода серии чисел на экран
вывода следует вывести текстовые сообщения (по выбору).
 */
public class Task29 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a1,a2;
        x = in.nextInt();
        for (int i=100; i<=999; i++){
            a1 = i%10;
            System.out.print(a1==x?i+" ":"");
        }
    }
}
