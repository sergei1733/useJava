package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.7
Напишите класс, который должен принять с клавиатуры значение 123
и вывести на экран сообщение Код принят.
Класс будет снова и снова принимать с клавиатуры значения до тех
пор, пока не будет введено значение 123. На каждое вводимое с клавиатуры значение, отличное от 123,
класс должен выводить сообщение Код неверный, повторите ввод.
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = in.nextInt();
        System.out.println("код прият");
        while (a!=123){
            System.out.println("Код неверный, повторите ввод");
            a = in.nextInt();
            System.out.println("код прият");
        }
    }
}
