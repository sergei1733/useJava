package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.48
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное число;
• затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа, в которых
  предварительно введенное двузначное число является «внутренней» частью (как, например,
23 для 123 или 623)
 */
public class Task48 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x,a1,a2,a3,a;
        x = in.nextInt();
        for (int i=100; i<=999; i++){
            a1=i%100;
            System.out.print(x==a1? i + " ":"");

        }
    }
}
