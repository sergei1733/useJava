package com.company.Section17;

import java.util.Scanner;

/*
Задание 17.10
Напишите метод, который принимает в качестве параметров целое
число и возвращает сумму его цифр.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        System.out.println(summaNumber(x));
    }
    public static int summaNumber(int a){
        int b, c, summ = 0;
        while (a>0){
            b = a%10;
            summ +=b;
            a = a/10;
        }
        return summ;
    }
}
