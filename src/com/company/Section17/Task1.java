package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.8
Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• О - в случае если число равно О;
• 1 - в случае если число положительное.
 */
public class Task1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        System.out.println(determingNumber(x));
    }
    public static int determingNumber (int a){
        int b = 0;
        if (a<0) b = -1;
        if (a==0) b = 0;
        if (a>0) b = 1;
        return b;
    }
}
