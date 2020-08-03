package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.4
Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение О.
Для каждого введенного с клавиатуры положительного числа класс должен выводить на экран текст
 Плюс, для каждого отрицательного - текст Минус.
 */
public class Task2 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a=1;
        while (a!=0){
            a = in.nextInt();
            System.out.println(a<0?"минус":"плюс");
        }
    }
}
