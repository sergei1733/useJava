package com.company.Section16;

import java.util.Scanner;
/*
Задание 16.6
Старинная задача: сколько можно купить быков и коров на 100 рублей,
если плата за быка 10 рублей, за корову- 5 рублей (во всех вариантах).
Напишите класс, который выводит на экран все возможные варианты
решения задачи.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        for (int i = 1; i<=10;i++){
            for (int j = 1; j<=20; j ++){
                if (i*10+j*5==100) System.out.println(i+" быков "+ j +" коров");
            }
        }
    }
}
