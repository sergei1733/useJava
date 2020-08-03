package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.12
Напишите класс, который принимает с клавиатуры целые числа, пока
не будут введены с клавиатуры друг за другом два одинаковых числа.
Класс должен выводить на экран сумму серии - за исключением последнего введенного с клавиатуры значения
 */
public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a=0,b=0,summ=0;
        do {
            summ+=a;
            summ+=b;
            a = in.nextInt();
            b = in.nextInt();
        }while (a!=b);
        System.out.println(summ);
    }
}
