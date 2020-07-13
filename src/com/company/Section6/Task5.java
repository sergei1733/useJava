package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры целое число и, если
        оно равно нулю, выводит на экран сообщение Ноль.
*/

import java.util.Scanner;


public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = in.nextInt();
        if (a == 0)  System.out.println("ноль");



    }
}