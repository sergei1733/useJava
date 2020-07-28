package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.34
Напишите класс, который принимает с клавиатуры целое число и выводит на экран 18
последующих ему чисел.
 */
public class Task34 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        for (int i=x; i<=x+18; i++){
            System.out.print(i+" ");
        }
    }
}
