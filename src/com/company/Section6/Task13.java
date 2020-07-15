package com.company.Section6;
        /*
        Задание 6.13
Напишите класс, который принимает с клавиатуры два значения: первое - числитель дроби, второе -
ее знаменатель.Класс должен определить, является ли эта дробь «законной» (существующей), и
вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       System.out.print("введите числитель");
       a = in.nextInt();
       System.out.print("введите знаменатель");
       b = in.nextInt();

       if (b != 0) System.out.println("дробь законная");



    }
}