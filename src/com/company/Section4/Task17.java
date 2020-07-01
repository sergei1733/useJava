package com.company.Section4;
        /*
   Напишите программу, которая выполняет перестановку над четырехзначным числом.
         */

import java.util.Scanner;


public class Task17 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, a4;
        a=in.nextInt();
        a1=a/1000;
        a2=(a/10)%100;
        a3=a%10;
        a4=a3*1000+a2*10+a1;
        System.out.println(a4);



    }
}