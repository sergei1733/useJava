package com.company.Section13;
import java.lang.Math;
import java.util.Scanner;

/*
Задание 13.26
Напишите класс, который создает серию из 15 случайных чисел из
диапазона -30 ... + 30.
Класс будет выводить на экран только те числа серии, которые имеют
такой же знак, как и предшествующее им число (значение О считать
положительным для данного задания).
 */
public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = -30, end = 30, a,a1=0,b,b1=0;
        for (int i =1; i<=15; i++){
            a = start+(int)((end - start+1)*Math.random());
          if ((a1>0 && a>0)||(a1<0 && a<0)) System.out.print(a+" ");
          a1=a;
        }
    }
}
