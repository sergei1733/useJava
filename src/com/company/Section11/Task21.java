package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.21
Напишите класс, который вначале принимает с клавиатуры целое положительное число
(в переменную х). Затем класс выводит на экран в
строку серию из 17 целых положительных чисел, отвечающую следующим условиям:
1) серия начинается с числа, большего хна 1;
2) каждое число в серии (начиная со второго) больше предьщущего на 1.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после
 окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */
public class Task21 {
    public static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
            int x;
            x = in.nextInt();
            System.out.println("start");
            for (int i=1; i<=17; i++){
                System.out.print((x++)+" ");
            }
            System.out.println("end");

    }
}
