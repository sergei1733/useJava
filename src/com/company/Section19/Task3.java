package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.14
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами
так, чтобы цифра десятков каждого элемента массива была равна цифре единиц следующего элемента.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], start = 10, end = 99, x;
        x = in.nextInt();
        array = new int[x];
        zapolnMass(array,start,end);
    }
    private static void zapolnMass(int array[], int start, int end){
        int a,a1,b=11;
        a = start+(int)((end - start+1)*Math.random());
        System.out.println(a);
        for (int i = 0; i<array.length; i++){
            b=0;
            a1 = a/10;
            while (b!=a1){
                a = start+(int)((end - start+1)*Math.random());
                b=a%10;
            }
            array[i] = a;
            System.out.print(array[i]+" ");
        }
    }
}
