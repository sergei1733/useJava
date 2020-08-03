package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.17
Напишите класс, который принимает с клавиатуры целое положительное число N и цифру D. Класс
должен проверить, есть ли внутри числа N цифра D, и вывести на экран соответствующее сообщение.
 */
public class Task15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, d, s;
        n = in.nextInt();
        d = in.nextInt();
        while (n>0){
            s = n%10;
            System.out.print(s==d?"цифра " + d+ " есть в числе":" нет");
            n = n/10;
        }
    }
}
