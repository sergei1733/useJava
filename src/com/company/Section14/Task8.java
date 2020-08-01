package com.company.Section14;
import java.lang.Math;
/*
Задание 14. 9
Напишите класс, который генерирует 24 целых трехзначных положительных числа и выводит на экран
порядковый номер самого большого из сгенерированных чисел.
 */
public class Task8 {
    public static void main(String[] args) {
        int start = 100, end = 999,a, max = 0,nomer = 0;
        for (int i=1;i<=24;i++){
            a = start+(int) ((end-start+1)*Math.random());
            System.out.print(a+" ");
            if (a>max){
                max = a;
                nomer = i;
            }
        }
        System.out.println();
        System.out.println(max+" "+nomer);
    }
}
