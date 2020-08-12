package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.6
Напишите метод, который получает в качестве параметра массив и
выводит на экран содержащиеся в нем значения в одну строку через
пробел между значениями.
 */
public class Task1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], start = 10, end = 99, x;
        x = in.nextInt();
        array = new int[x];
        zapMass(array,start,end);
    }
    private static void zapMass(int array[], int start, int end){
        for (int i = 0; i<array.length; i++){
            array[i] = start + (int)((end-start+1)*Math.random());
            System.out.print(array[i]+" ");
        }
    }
}
