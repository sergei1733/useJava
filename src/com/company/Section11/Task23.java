package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.23
Напишите класс, который вначале принимает с клавиатуры целое положительное
 число (в переменную х), которое будет количеством членов в арифметической
 прогрессии. Первый член прогрессии равен 7, а разница между соседними членами
прогрессии равна 4. Затем класс выводит на экран в строку серию из х членов
этой прогрессии. Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */
public class Task23 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a=7;

        x = in.nextInt();
        System.out.println("start");
        for (int i=1; i<=x; i++){
            System.out.print((a+=4)+" ");
        }
        System.out.println("end");
    }

}