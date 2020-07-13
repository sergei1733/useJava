package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры целое число и выводит на экран одно из
        следующих сообщений: Положительное, или Отрицательное, или Ноль, - в зависимости от значения числа.
 */

import java.util.Scanner;


public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = in.nextInt();
        if (a>0) System.out.println("положительное");
        else if (a<0) System.out.println("отрицательное");
        else System.out.println("ноль");



    }
}