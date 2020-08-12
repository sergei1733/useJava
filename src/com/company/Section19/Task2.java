package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.13
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами, у
каждого из которых сумма цифр делится на 9 без остатка.
 */
public class Task2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, start = 10, end = 99, array[];
        x = in.nextInt();
        array = new int[x];
        zapMass(array,start,end);
        out(array);
    }
    private static void zapMass(int array[], int start, int end){
        for (int i = 0; i<array.length; i++){
            int a=10;
            while (a%9!=0)
                a = start + (int) ((end - start + 1) * Math.random());
            if (a%9==0)
                array[i] = a;
        }
    }
    private static void out(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
