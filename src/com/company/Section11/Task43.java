package com.company.Section11;
/*
Задание 11.43
Напишите класс, который выводит на экран (в строку с пробелами) все
двузначные целые положительные числа, в которых и цифра единиц, и
цифра десятков делятся без остатка на три.
 */
public class Task43 {
    public static void main(String[] args) {
        int a1,a2;
        for (int i = 10; i<=99;i++){
            a1 = i/10;
            a2 = i%10;
            System.out.print(a1%3==0 && a2%3==0?i+" ":"");
        }
    }
}
