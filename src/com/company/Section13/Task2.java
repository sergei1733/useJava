package com.company.Section13;
import java.util.Scanner;
/*
Задание 13.5
Назовем «базой» положительного числа Х сумму всех положительных
целых чисел, меньших Х.
Напишите класс, который принимает с клавиатуры положительное
целое число Х и подсчитывает его «базу».
 */
public class Task2 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x, s = 0;
        x = in.nextInt();
        for (int i = 1; i < x; i++) {
            s += i;
        }
        System.out.println(s);
    }
}
