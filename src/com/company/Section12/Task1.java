package com.company.Section12;
import java.util.Scanner;
/*
Задание 12.2
Напишите класс, который принимает с клавиатуры 15 целых чисел и
выводит на экран информацию о том, сколько из них были четными и
сколько нечетными.
 */
public class Task1 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0, x, count1 = 0;
        for (int i=1; i<=15; i++) {
            x = in.nextInt();
            if (x % 2 == 0)
                count++;
            else
                count1++;
        }
        System.out.println("четные " + count);
        System.out.println("не четные "+ count1);



    }
}
