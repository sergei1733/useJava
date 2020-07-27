package com.company.Section10;
import java.lang.Math;
import java.util.Scanner;
/*
Задание 10.4
Напишите класс, который принимает с клавиатуры целое положительное число,
 а затем генерирует три целых положительных числа, меньших первого.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int  a,b,c,d;
    a = in.nextInt();
    b = (int)(a*Math.random());
    c = (int)(a*Math.random());
    d = (int)(a*Math.random());
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
