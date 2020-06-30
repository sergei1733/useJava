package com.company;
        /*
    Подрабатывая в течение года, Вася собрал себе определенную сумму на
    поездку за границу, а родители добавили ему от себя еще некоторую
    сумму.
    Напишите класс, который принимает с клавиатуры три значения:
    первое - сумма в рублях, заработанная Васей, второе - сумма в рублях,
    которую ему дали родители, третье - курс рубля по отношению к евро.
    Класс должен подсчитать и вывести на экран сумму в евро, которая
    имеется у Васи для поездки за границу.
         */

import java.util.Scanner;

public class Task3_10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int s1, s2, course, summa;
        System.out.print("сумма васи ");
        s1 = in.nextInt();
        System.out.print("сумма родителей ");
        s2 = in.nextInt();
        System.out.print("курс евро ");
        course = in.nextInt();
        summa = (s1 + s2) / course;

        System.out.println("сумма в евро " + summa);
    }
}