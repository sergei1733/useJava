package com.company.Section11;
/*
Задание 11.40
Напишите класс, который выводит на экран все целые положительные
трехзначные числа, соответствующие следующему требованию: произведение первой и
 последней цифр равно квадрату средней.
 */
public class Task40 {
    public static void main(String[] args) {
        int a,a1,a2,a3,b;
        for (int i=100;i<=999;i++){
            a1 = i/100;
            a2 = (i%100)/10;
            a3 = i%10;
            if (a1*a3==a2*a2)
                System.out.println(i+" ");
        }

    }
}
