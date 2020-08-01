package com.company.Section14;

import java.util.Scanner;

/*
Задание 14.2
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший
результат, а также порядковый номер победителя (можно предположить, что есть только один победитель).
 */
public class Task1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,x1,min,n=0;
        min = in.nextInt();
        for (int i=1;i<=10;i++){
            x1 = in.nextInt();
            if (x1< min) {
                min = x1;
                n = i;
            }
            }
        System.out.println("минимальное время " +min + " у спортсмена номер " + n);

        }
    }

