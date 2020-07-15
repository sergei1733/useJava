package com.company.Section8;
        /*
Задание 8.10
Напишите класс, который принимает с клавиатуры целое число и выводит на экран его квадрат,
но только в случае, если введенное число отрицательно. В противном случае - на экран выводится
сообщение Ошибка.
*/

import java.util.Scanner;


public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();

       if (a < 0)
           System.out.println(a * a);
       else
           System.out.println("Ошибка");


    }
}