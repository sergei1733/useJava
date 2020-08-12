package com.company.Section18;

import java.util.Scanner;

/*
Задание 18.13
Напишите класс, который заполняет случайными четырехзначными
числами массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива в
одной строке, начиная с «конца>> массива (с последней ячейки).
 */
public class Task2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1000, end = 9999, n;
        n = in.nextInt();
        int [] array = new int[n];
        zapMass(array,start,end);
        write(array);
    }
    private static void zapMass(int array[],int start, int end){
        for (int i = 0; i<=array.length-1;i++){
            array[i] = start+(int)((end - start+1)*Math.random());
        }
    }
    private static void write(int array[]){
        for (int i=0; i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}
