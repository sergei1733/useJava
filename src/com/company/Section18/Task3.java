package com.company.Section18;

import java.util.Scanner;

/*
Задание 18.15
Напишите класс, который заполняет случайными двузначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - значения из четных ячеек массива;
• во второй строке - значения из нечетных ячеек массива.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 10, end = 99, array[], x;
        x = in.nextInt();
        array = new int[x];
        zapolnMass(array, start, end);
        output(array);

    }

    private static void zapolnMass(int array[], int start, int end) {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = start + (int) ((end - start + 1) * Math.random());
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void output(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            if ((i + 1) % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= array.length - 1; i++) {
            if ((i + 1) % 2 != 0)
                System.out.print(array[i] + " ");
        }
    }
}
