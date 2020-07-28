package com.company.Section11;
import java.lang.Math;
/*
Задание 11.37
Напишите класс, который генерирует 20 случайных чисел из диапазона
от-18до 18.
Для каждого отрицательного числа следует вывести на экран само
число и его квадрат (в одной строке), для положительного - само
число и округленный (по правилам округления, принятым в математике) корень из числа.
Значения, равные нулю, не выводятся на экран вообще.
 */
public class Task37 {
    public static void main(String[] args) {
        int start = -18, end = 18,a;
        for (int i = 1; i<=20; i++){
            a = start + (int)((end-start+1)*Math.random());
            if (a<0) System.out.print(a+" "+(a*a)+" ");
            if (a>0) System.out.print(a+" "+Math.round(Math.sqrt(a))+" ");
        }
    }

}
