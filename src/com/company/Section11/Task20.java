package com.company.Section11;
/*
Задание 11.20
Напишите класс, который выводит на экран в строку положительные
трехзначные числа, делящиеся на 80 с остатком 45 (в возрастающем
порядке). Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */
public class Task20 {
    public static void main(String[] args) {
        System.out.println("strat");
        for (int i = 100; i<=999;i++){
            if (i%80==45) System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("end");
    }
}
