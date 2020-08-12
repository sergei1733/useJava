package com.company.Section18;

import java.util.Scanner;
/*
Задание 18.16
Напишите класс, который заполняет случайными двузначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - четные значения, содержащиеся в массиве;
• во второй строке - нечетные значения, содержащиеся в массиве.
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 10, end = 99, x, array[];
        x = in.nextInt();
        array = new int[x];
        zapMass(array,start,end);
        out(array);
    }
    private static void zapMass (int array[], int start, int end){
        for (int i = 0; i<array.length;i++){
            array[i] = start +(int)((end-start+1)*Math.random());
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    private static void out(int array[]){
        for (int i = 0; i<array.length;i++){
            if (array[i]%2==0)
                System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<array.length; i++){
            if (array[i]%2!=0)
                System.out.print(array[i]+" ");
        }
    }
}
