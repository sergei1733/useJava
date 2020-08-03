package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.22
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел, для
каждого введенного числа класс должен напечатать сумму его цифр. После окончания ввода
класс выведет на экран порядковый номер числа с самой большой суммой цифр.
 */
public class Task20 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a,b, summ = 0, max = 0, n=0;
        for (int i = 1; i<=15; i++){
            x = in.nextInt();
            while (x>0){
                a = x%10;
                summ +=a;
                x = x/10;
            }
            if (summ>max) {
                max = summ;
                n = i;
            }
            System.out.println(summ);
            summ = 0;
        }
        System.out.println(n);
    }
}
