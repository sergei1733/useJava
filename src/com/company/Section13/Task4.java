package com.company.Section13;
import java.util.Scanner;
/*
Задание 13.7
Назовем «дважды четным» целое положительное число, если и оно само, и сумма его делителей -
четные числа. Напишите класс, который принимает с клавиатуры целое положительное число и
проверяет, является ли оно «дважды четным».
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a,summ = 0;
        x = in.nextInt();
        for (int i=1; i<=x; i++){
            if (x%i==0) summ+=i;
        }
        System.out.println(x%2==0 && summ%2==0?"да":"нет");
    }
}
