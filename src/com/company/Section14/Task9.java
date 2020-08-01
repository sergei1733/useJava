package com.company.Section14;

/*
Задание 14.10
Напишите класс, который генерирует 25 целых положительных трехзначных чисел и выводит на экран
порядковый номер числа, сумма цифр которого была максимальной.
 */
public class Task9 {
    public static void main(String[] args) {
        int start = 100, end = 999, a, a1, a2, a3, summ = 0, max = 0,b=0;
            for (int i = 1; i<=25; i++){
                a = start +(int)((end - start+1)*Math.random());
                System.out.print(a+" ");
                a1 = a/100;
                a2 = (a%100)/10;
                a3 = a%10;
                summ = a1+a2+a3;
                if (summ>max) {
                    max = summ;
                    b = a;
                }
            }
        System.out.println();
        System.out.println(b+" "+max);
    }
}
