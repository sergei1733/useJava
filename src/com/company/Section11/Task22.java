package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.22
Напишите класс, который вначале принимает с клавиатуры целое положительное число
 (в переменную х). Затем класс выводит на экран в
строку серию из 17 целых положительных чисел, отвечающую следующим условиям:
1) серия начинается с числа, меньшего хна 10;
2) каждое число в серии (начиная со второго) меньше предыдущего на 6.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */
public class Task22 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a=0;
        x = in.nextInt();
        System.out.println("start");
        for (int i=1; i<=17; i++){
            if (i==1){a = x-10;
                System.out.print(a+" ");}
            System.out.print((a-=6)+" ");
        }
        System.out.println();
        System.out.println("end");
    }


}
