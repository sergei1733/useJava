package com.company.Section11;
import java.lang.Math;
/*
Задание 11.8
Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел из диапазона
-20".+35. После каждого отрицательного числа следует вывести (вплотную к числу) символ«?»
(знак вопроса).
 */
public class Task8 {
    public static void main(String[] args) {
        int start = -25, end = 35,a;
        for (int i = 1; i<=15; i++){
            a = start + (int)((end-start+1)*Math.random());
            if (a>0) System.out.print(a);
            else System.out.print(a+"?");
        }
    }
}
