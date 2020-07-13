package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры два целых числа и,
если первое больше второго, выводит на экран их сумму, если же наоборот - выводит
на экран их произведение. В случае же, если числа одинаковы, программа выводит на экран
сообщение Числа равны.
*/

import java.util.Scanner;


public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        if (a > b) System.out.println(a + b);
        else if (a < b) System.out.println(a * b);
        else System.out.println("Числа равны");



    }
}