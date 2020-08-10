package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.11
Напишите метод, который принимает в качестве параметра целое число и возвращает
количество цифр в этом числе.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        System.out.println(numberDigits(x));
    }
    public static int numberDigits(int number){
        int a,b,count =0;
        while(number>0){
            count ++;
            number /=10;
        }
        return count;
    }
}
