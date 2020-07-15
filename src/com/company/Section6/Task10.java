package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры два целых числа и,
если оба имеют одинаковый знак, на экран выводится сообщение
Один и тот же знак, а если разный, то на экран выводится сообщение
Разные знаки. Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
*/

import java.util.Scanner;


public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,a1,a2,a3,c;
        a = in.nextInt();
        c = in.nextInt();

        if (a > 0 && c>0)
            System.out.println("один и тот же знак");
        else if (a < 0 || c < 0)
            System.out.println("разные знаки");
        else if (a == 0 || c == 0)
            System.out.println(" не корректно");



    }
}