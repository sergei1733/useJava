package com.company.Section12;
import java.util.Scanner;
/*
Задание 12.3
Напишите класс, который принимает с клавиатуры 12 целых чисел и
выводит на экран информацию о том, сколько из них были больше,
чем первое число.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, count = 0, a;
        a = in.nextInt();
        for (int i = 1; i<=11;i++){
            x = in.nextInt();
            if (x>a)
                count++;
        }
        System.out.println(count);
    }
}
