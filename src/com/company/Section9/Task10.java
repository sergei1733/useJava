package com.company.Section9;
        /*
      Задание 9.10
Напишите класс, который принимает с клавиатуры три целых числа и
определяет, в каких соотношениях с точки зрения значений (равны,
больше, меньше) они находятся. На экран следует вывести сообщение с
точным указанием результатов проверки: например, Первое и третье
равны, второе больше них или Все значения одинаковы.
*/

import java.util.Scanner;


public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a==b && a==c) System.out.println("все числа равны");
        if (a>b && a>c) System.out.println("первое больше второго и третьего");
        if (b>a && b>c) System.out.println("второе больше первого и третьего");
        if (c>a && c>b) System.out.println("третье больше второго и первого");

     }
}
