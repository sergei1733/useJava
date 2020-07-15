package com.company.Section7;
        /*
        Задание 7.6

Напишите класс, который принимает с клавиатуры два числа и проверяет, равны они друг другу или нет.
*/

import java.util.Scanner;


public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();
       if (a == b) System.out.println("равны");
       else
           System.out.println("не равны");



    }
}