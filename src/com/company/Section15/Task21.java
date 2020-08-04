package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.23
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по значению) цифры этого числа,
через пробел;
• во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8,
а во второй строке - 7 5 7 3
 */
public class Task21 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a;
        String s1 = "", s2="";
        x = in.nextInt();
        while (x > 0) {
            a = x % 10;
            if (a % 2 == 0) s1 += a + " ";
            else s2 += a + " ";
            x /= 10;
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
