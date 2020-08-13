package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.17
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами
так, чтобы первая и вторая половины массива были идентичными.
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], start = 10, end = 99,x;
        x = in.nextInt();
        array = new int[x];
        zappMass(array,start,end);
        out(array);

    }
    private static void zappMass(int array[], int start, int end){
        for (int i=0; i<array.length/2;i++){
            array[i] = start+(int)((end-start+1)*Math.random());
            array[array.length/2+i] = array[i];
        }
    }
    private static void out(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
