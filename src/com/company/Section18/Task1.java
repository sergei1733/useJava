package com.company.Section18;

import java.util.Scanner;

/*
Задание 18.12
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива в
одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Task1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, start = 100, end = 999;
        int array[];
        n=in.nextInt();
        array = new int[n];
        for (int i = 0; i<=n-1;i++){
            array[i] = start +(int)((end - start+1)*Math.random());
            System.out.print(array[i]+"  ");
        }

    }
}
