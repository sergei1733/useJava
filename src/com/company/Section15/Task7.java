package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.9
Напишите класс, который принимает с клавиатуры целое число, а затем выводит на экран последующие ему
целые числа, пока сумма этих чисел не превышает квадрата введенного числа.
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,x,summ = 0,b=0;
        a = in.nextInt();
        x = a*a;
        summ = a;
        while (summ<x){
            a++;
            System.out.print(" "+a);
            summ+=a;
        }
        System.out.println();
        System.out.println(summ);

    }
}
