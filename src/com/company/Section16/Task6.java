package com.company.Section16;

import java.util.Scanner;

/*
Задание 16.9
Напишите класс для графического изображения делимости чисел
от 1 до n (значение переменной n вводится с клавиатуры). В каждой
строке надо вывести число и столько плюсов, сколько делителей у этого числа
(считая и единицу, и само число). Например, если исходное
данное - число 4, то на экран должно быть выведено:
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, b;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
