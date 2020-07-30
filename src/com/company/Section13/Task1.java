package com.company.Section13;
import java.lang.Math;
/*
Задание 13.2
Напишите класс, который генерирует серию из 20 случайных положительных двузначных чисел и
определяет сумму значений в серии.
 */
public class Task1 {
    public static void main(String[] args) {
        int start = 10, end = 99, x, s=0;
        for (int i=1; i<=20;i++){
            x = start +(int)((end-start+1)*Math.random());
            s+=x;
        }
        System.out.println(s);
    }
}
