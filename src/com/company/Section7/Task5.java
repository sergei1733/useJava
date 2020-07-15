package com.company.Section7;
        /*
        Задание 7.5
Напишите класс, который принимает с клавиатуры целое число и определяет,
является оно положительным или нет, и выводит на экран
одно из двух соответствующих результатам проверки сообщений: Положительное число и
 Не положительное число.
*/

import java.util.Scanner;


public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();

       if (a > 0) System.out.println("положительное");
       else
           System.out.println("Отрицательное");



    }
}