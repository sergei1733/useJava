package com.company.Section18;

import java.util.Scanner;

/*
Задание 18.14
Напишите класс, который заполняет случайными трехзначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - первую половину массива;
• во второй строке - вторую половину массива.
В случае если массив имеет нечетный размер, центральную ячейку
следует выводить в первой строке.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 100, end = 999, x;
        int array[];
        x = in.nextInt();
        array = new int[x];
        zapMass(array, start, end);
        out(array);
    }

    private static void zapMass(int array[], int start, int end) {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = start + (int) ((end - start + 1) * Math.random());
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void out(int array[]) {
        int a, l1, l2;
        if (array.length % 2 != 0)
            l1 = array.length / 2 + 1;
        else
            l1 = array.length / 2;
        for (int i = 0; i <= l1 - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = l1; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
