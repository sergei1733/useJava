package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.14
Напишите класс, который принимает с клавиатуры целое положительное число и выводит на экран
количество его цифр и их сумму.
 */
public class Task12 {
    public static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a = 0,summ=0,count = 0;
        x = in.nextInt();
        while (x>0){
            a += x%10;
            x = x /10;
            count++;
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(a);
        System.out.println(count);


    }
    
}
