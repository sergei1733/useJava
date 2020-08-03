package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.13
Напишите класс, который должен принимать с клавиатуры серию возрастающих по значению целых чисел.
Класс должен выводить на экран количество значений в серии - за
исключением последнего введенного с клавиатуры значения
 */
public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b, count=1;
        a = in.nextInt();
        b = in.nextInt();
        while (b>a){
            count++;
            a = b;
            b = in.nextInt();
        }
        System.out.println(count);
    }
}
