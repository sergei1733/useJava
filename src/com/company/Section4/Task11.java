package com.company.Section4;
        /*
    Назовем «длиной двузначного числа» разницу между числом десятков
    (первая цифра) и числом единиц (вторая цифра).
    Напишите класс, который принимает с клавиатуры двузначное число и
    выводит на экран его «длину».
         */

import java.util.Scanner;

public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, a4;
        a = in.nextInt();
        a1 = a-a%10;
        a2 = a%10;
        a3 = a1-a2;
        System.out.println(a3);
    }
}