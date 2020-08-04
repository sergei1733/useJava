package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.25
Напишите класс, который принимает с клавиатуры целое положительное число и выводит
на экран его первую цифру. Например, для числа 7659 на экран будет выведено 7
 */
public class Task23 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a=0;
        x = in.nextInt();
        while (x>0){
            a = x%10;
            x /=10;
        }
        System.out.println(a);
    }
}
