package com.company.Section14;
import java.lang.Math;
/*
Задание 14.8
Напишите класс, который генерирует 15 целых положительных трехзначных чисел и выводит на экран число,
 сумма цифр которого была минимальной.
 */
public class Task7 {
    public static void main(String[] args) {
        int start = 100, end = 999, a, summ = 0, a1,a2,a3, b=0,min=999;
        for (int i = 1; i<=15; i++){
            a = start + (int)((end - start +1)*Math.random());
            System.out.print(a+" ");
            a1 = a/100;
            a2 = (a%100)/10;
            a3 = a%10;
            summ = a1+a2+a3;
            if (summ<min){
                min = summ;
                b = a;
            }
        }
        System.out.println();
        System.out.println(min+" "+b);
    }
}
