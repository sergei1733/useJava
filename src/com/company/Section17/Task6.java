package com.company.Section17;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/*
Задание 17.В

Напишите метод, который принимает в качестве параметра два целых
числа и возвращает значение true, если в числах одинаковое количество
цифр; в ином случае метод возвращает значение false.
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,x1;
        x = in.nextInt();
        x1 = in.nextInt();
        System.out.println(amountOfNumbers(x,x1));
    }
    public static boolean amountOfNumbers(int a,int b){
        int count = 0, count1 = 0;
        while (a>0){
            count ++;
            a /=10;
        }
        while (b>0){
            count1 ++;
            b/=10;
        }
        System.out.println("a "+count);
        System.out.println("b "+count1);
        if (count==count1)
            return true;
        else
            return false;
    }
}
