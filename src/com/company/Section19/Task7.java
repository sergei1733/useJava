package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.18
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами
так, чтобы они образовывали неубывающую последовательность (каждый
элемент не меньше предыдущего).
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], start = 10, end = 99, x;
        x = in.nextInt();
        array = new int[x];
        zapMass(array,start,end);
        our(array);
    }
    private static void zapMass(int array[], int start, int end){
        array[0]= start +(int)((end-start+1)*Math.random());
        for (int i = 1; i<array.length;i++){
            while (array[i]<array[i-1]){
                array[i] = start +(int)((end-start+1)*Math.random());
            }
        }
    }
    private static void our(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
