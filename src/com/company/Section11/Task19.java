package com.company.Section11;
/*
Задание 11.19
Напишите класс, который выводит на экран в строку положительные
двузначные числа, делящиеся на 5 (в убывающем порядке). Числа
должны отделяться друг от друга знаком «пробел». Перед началом и
после окончания вывода серии чисел на экран вывода следует вывести
текстовые сообщения (по выбору).
 */
public class Task19 {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i=95; i>=5; i-=5){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("end");
    }

}
