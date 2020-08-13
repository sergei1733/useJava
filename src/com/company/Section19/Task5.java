package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.16
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами
так, чтобы значение первого элемента было равно значению последнего, значение
второго элемента было равно значению предпоследнего и так далее.
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
    public static void zapMass(int array[], int start, int end){
        for (int i = 0; i< array.length/2; i++){
            array[i]=start+(int)((end-start+1)*Math.random());
            array[array.length-i-1] = array[i];
        }
    }
    public static void out(int array[]){
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
