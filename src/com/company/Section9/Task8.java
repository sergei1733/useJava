package com.company.Section9;
        /*
        Задание 9.8
Назовем билет с шестизначным номером «счастливым», если сумма
первых трех его цифр равна сумме последних трех его цифр и обе эти
суммы являются четными.
Напишите класс, который принимает с клавиатуры шестизначный номер
билета и проверяет, является ли он «счастливым» или не является.
*/

import java.util.Scanner;


public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a1_1, a1_2, a1_3, a2_1, a2_2, a2_3, b1, b2;
        a = in.nextInt();
        a1 = a / 1000;
        a2 = a - a1 * 1000;
        a1_1 = a1 / 100;
        a1_2 = (a1 - a1_1 * 100) / 10;
        a1_3 = a1 % 10;
        a2_1 = a2 / 100;
        a2_2 = (a2 - a2_1 * 100) / 10;
        a2_3 = a2 % 10;
        b1 = a1_1 + a1_2 + a1_3;
        b2 = a2_1 + a2_2 + a2_3;
        if (b1 == b2 && b1 % 2 == 0 && b2 % 2 == 0)
            System.out.println("счастливый");
        else
            System.out.println("не счастливый");
    }
}
