package com.company.Section14;

import java.util.Scanner;

/*
Задание 14.6
Напишите класс, который принимает с клавиатуры серию из 27 целых
чисел и сравнивает два значения: среднее арифметическое максимума
и минимума, и среднее арифметическое всех значений серии.
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int max, min, count = 2, countMax = 1, countMin = 1, x, a, b, sMin = 0, sMax = 0, summ = 0;
        a = in.nextInt();
        b = in.nextInt();
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        sMax = max;
        sMin = min;
        summ = max + min;
        for (int i = 1; i <= 6; i++) {
            x = in.nextInt();
            if (x < min) {
                min = x;
                sMin += min;
                countMin++;
            }
            if (x > max) {
                max = x;
                sMax += max;
                countMax++;
            }
            count++;
            summ += x;
        }
        System.out.println(" min " + sMin + " " + countMin + " " + (sMin / countMin));
        System.out.println(" max " + sMax + " " + countMax  + " " + (sMax / countMax));
        System.out.println("summ" + summ + " " +  count);


    }
}

