package com.company.Section7;
        /*
     Задание 7.10
Напишите программу, которая принимает с клавиатуры число и превращает его в положительное, если
оно отрицательное либо в ноль во всех остальных случаях.
*/

import java.util.Scanner;


public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();

       if (a < 0) System.out.println(a * -1);
       else
           System.out.println(a * 0);



    }
}