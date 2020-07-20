package com.company.Section9;
import java.util.Scanner;
/*
Задание 9.28
Напишите класс, который принимает с клавиатуры положительное трехзначное число и проверяет,
сколько одинаковых цифр оно содержит.
 */
public class Task28 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    int a,b=0,a1,a2,a3;
    a = in.nextInt();
    a1 = a/100;
    a2 = (a-a1*100)/10;
    a3 = a%10;
    if (a1==a2 || a2==a3 || a1==a3) b=2;
    if (a1==a2 && a2==a3) b=3;
    if (a1!=a2 && a1!=a3 && a2!=a3)b=0;

        System.out.println(b);
    }
}
