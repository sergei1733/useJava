package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.8
Напишите класс, который принимает с клавиатуры значения, пока их
сумма остается меньше 150. По окончании ввода следует вывести на
экран информацию о количестве введенных значений и их сумме.
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, summ = 0, count = 0;
        do {
            a = in.nextInt();
            count++;
            summ+=a;
        }while (summ<150);
        System.out.println("summ "+summ);
        System.out.println("count "+count);
    }
}
