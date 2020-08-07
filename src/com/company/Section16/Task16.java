package com.company.Section16;
/*
Задание 16.19
Напишите класс, который выводит на экран все трехзначные числа,
для которых соблюдаются два условия:
• само число заканчивается на О;
• сумма нечетных делителей этого числа тоже заканчивается на О.
 */
public class Task16 {
    public static void main(String[] args) {
        int a, b, summ = 0;
        for (int i = 100; i <= 990; i += 10) {
            summ = 0;
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    if (i % j == 0){
                    summ += j;
                    System.out.print(" " + j);}
                }
            }
            System.out.println();
             if (summ%10==0)System.out.println("число " + i + " сумма " + summ);
        }
    }
}

