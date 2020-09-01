package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.46
Напишите метод, который принимает в качестве параметра массив
целых чисел и дополнительное целое число К. Если К положительное,
метод производит К правых сдвигов, если К отрицательное, - метод
производит К левых сдвигов.
 */
public class Task17 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array;
        int k;
        array = new int[5];
        k = in.nextInt();
        zapMass(array);
        outArray(array);
        sortArray(array,k);
    }
    private static void zapMass(int[] array){
        for (int i=0; i<array.length;i++){
            array[i] = in.nextInt();
        }
    }
    private static void outArray(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
    }
    private static void sortArray(int[] array, int k){
        int s;
        while (k>0) {
            for (int i = array.length - 1; i >= 1; i--){
                s = array[i];
                array[i] = array[i - 1];
                array[array.length - i] = s;
            }
            k--;
        }
        System.out.println();
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
}
