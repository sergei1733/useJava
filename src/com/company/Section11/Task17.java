package com.company.Section11;
/*
Задание 11.17
Напишите класс, который выводит на экран в строку положительные
трехзначные числа, заканчивающиеся на 7 (в возрастающем порядке).
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после
окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */
public class Task17 {
    public static void main(String[] args) {
        int  a;
        System.out.println("start");
        for (int i =100; i<=999; i++){
            a = i%10;
            if (a==7) System.out.print(i+" ");
        }
        System.out.println("end");
        //второй способ белее правильный
        for (int i =107; i<=997; i+=10){
            System.out.print(i+" ");
        }
    }
}