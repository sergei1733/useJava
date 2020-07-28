package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.36
Напишите класс, который принимает с клавиатуры целое число и выводит на экран 10
предшествующих ему чисел, причем разница между значениями этих чисел должна быть равна 6
 */
public class Task36 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        x = in.nextInt();
        for (int i =1; i<=10; i++){
            System.out.print((x-=6)+" ");
        }
    }
}
