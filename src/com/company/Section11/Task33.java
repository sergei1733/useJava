package com.company.Section11;
/*
Задание 11.П
Напишите класс, который выводит на экран положительные трехзначные числа,
делящиеся без остатка на 11 (начиная с наименьшего).
 */
public class Task33 {
    public static void main(String[] args) {
        int x;
        for (int i=121; i<=999; i+=11){
            System.out.print(i+" ");
        }
    }
}
