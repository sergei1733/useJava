package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.24
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по месту) цифры этого числа, через
пробел;
• во второй строке - все нечетные (по месту) цифры этого числа,
через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
а во второй строке - 7 5 7.
 */
public class Task22 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a, b, pos = 0;
        String s1 = "", s2 = "";
        x = in.nextInt();
        while (x > 0) {
            pos++;
            a = x % 10;
            x /= 10;
            if (pos % 2 == 0)
                s1 += a + " ";
            else
                s2 += a + " ";
        }
        System.out.println(s1);
        System.out.println(s2);

    }
}
