package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.22
Напишите метод, который принимает два параметра: массив целых
чисел М и еще одно целое число Х. Метод возвращает количество ячеек
массива М, содержащих значение Х (число появлений Х в М).
 */
public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], start = 1, end = 500, x, n;
        n = in.nextInt();
        array = new int[n];
        x = in.nextInt();
        zapMass(array, start,end);
        out(array,x);
    }

    private static void zapMass(int array[], int start, int end) {
        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int) ((end - start + 1) * Math.random());
            System.out.print(array[i] + " ");
        }
    }

    private static void out(int array[], int x) {
        int count = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                count++;
        }
        System.out.println(" число появлений " + count);
    }
}
