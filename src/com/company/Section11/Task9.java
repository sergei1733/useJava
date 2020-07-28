package com.company.Section11;
import java.lang.Math;
/*
Задание 11.9
Напишите класс, который выводит на экран (в одну строку) 20 случайных
чисел из диапазона 27". 73. Перед каждым значением, делящимся на 3
без остатка, следует вывести (вплотную к числу) символ «#» (решетка).
 */
public class Task9 {
    public static void main(String[] args) {
        int start = 27, end = 73, a;
        for (int i = 1; i<=20; i++){
            a = start + (int)((end-start+1)*Math.random());
            if (a%3==0) System.out.print("#"+a);
            else System.out.print(a);
        }
    }
}
