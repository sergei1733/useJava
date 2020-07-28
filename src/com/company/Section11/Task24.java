package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.24
Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х). Затем класс выводит на экран в
строку серию из 2х убывающих чисел, начиная с О; разница между соседними значениями в серии равна 8. Числа должны отделяться друг от
друга знаком «пробел». Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по
выбору).
 */
public class Task24 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a,b;
        x = in.nextInt();
        System.out.println("start");
        a=x;
        for (int i=1;i<=2*x; i++){
            a -= 1;
            if (a>0)
                System.out.print(a+" ");
            else {
                a -= 8;
                System.out.print(a+" ");
            }
        }
        System.out.println("end");

    }
}
