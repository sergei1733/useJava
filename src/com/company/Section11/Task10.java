package com.company.Section11;
import java.lang.Math;
/*
Задание 11.10
Напишите класс, который выводит на экран (в одну строку) 19 случайных чисел из
 дr1апазона «однозначные числа». Каждое значение, равное О, следует вывести на
 экран «В окружении» (вплотную к числу, перед ним и после него) символов«%» (процент).
 */
public class Task10 {
    public static void main(String[] args) {
        int start = -9, end = 9,a;
        for (int i=1; i<=19; i++){
            a = start + (int)((end-start+1)*Math.random());
            if (a==0) System.out.print("%"+a+"%");
            else
                System.out.print(a);
        }
    }
}

