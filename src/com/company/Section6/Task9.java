package com.company.Section6;
        /*
        Напишите программу (класс), которая принимает с клавиатуры двузначное число
        и проверяет, что больше: само это число или произведение его цифр.
*/

import java.util.Scanner;


public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,a1,a2,a3,c;
        a = in.nextInt();
        a1 = a / 10;
        a2 = a % 10;
        if ((a1+a2)>(a1*a2)) System.out.println("число больше");
        else System.out.println("произведение больше ");



    }
}