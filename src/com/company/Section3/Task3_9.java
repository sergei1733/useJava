package com.company.Section3;
        /*
      Компания по продаже минеральной воды проводит конкурс «Балл под
      крышкой»: на внутренней стороне пробок, которыми закрыты бутылки,
      выпускаемые компанией, напечатаны призовые баллы. Есть пробки, «равные»
      10 баллам, есть - 100, есть - 1000.
      Напишите класс, который принимает с клавиатуры три числа, означающие
      количество пробок каждого типа, собранных Васей, и выводит
      на экран общее количество баллов, которые Вася получил.
         */

import java.util.Scanner;

public class Task3_9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int bal_10, bal_100, bal_1000, summa;
        System.out.print("введите количество пробок по 10 баллов ");
        bal_10 = in.nextInt();
        System.out.print("введите количество пробок по 100 баллов ");
        bal_100 = in.nextInt();
        System.out.print("введите количество пробок по 1000 баллов ");
        bal_1000 = in.nextInt();
        summa = bal_10 * 10 + bal_100 * 100 + bal_1000 * 1000;
        System.out.println(summa);
    }
}