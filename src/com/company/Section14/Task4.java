package com.company.Section14;

import java.util.Scanner;

/*
Задание 14.5
Напишите класс, который принимает с клавиатуры серию из 12 целых
чисел и определяет среднее арифметическое максимума и минимума
для этой серии.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int max, min, x, countMin = 0, countMax = 0;
        max = in.nextInt();
        min = in.nextInt();
        for (int i=1;i<=12;i++){
            x = in.nextInt();
            if (x<min){ min = x; countMin++; }
            if (x>max){ max = x; countMax++;}
        }
        System.out.println(" max "+max+" " +countMax+" "+(max/countMax));
        System.out.println(" min "+min + " "+ countMin+" "+(min/countMin));
    }
}
