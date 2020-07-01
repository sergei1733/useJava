package com.company.Section4;
        /*
    Назовем «степенью четности» числа количество четных цифр в нем. Например, для числа
    4612 степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
    Напишите класс, который принимает с клавиатуры положительное
    двузначное число, а затем вычисляет и выводит на экран его «степень
    четности».
         */

import java.util.Scanner;

public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3=0, a4;
        a = in.nextInt();
        a1 = a / 10;
        a2 = a % 10;
        if (a1 % 2 == 0) a3 = a3 + 1;
        if (a2 % 2 == 0) a3 = a3 + 1;
        System.out.println(a3);
    }
}