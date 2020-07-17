package com.company.Section9;
        /*
    Задание 9.23
Целое трехзначное число называется «дважды четным», если и сумма
его цифр, и их произведение являются четными.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и проверяет, является ли оно «дважды четным».
*/

import java.util.Scanner;


public class Task23 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, summ, multiplication;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = a%10;
        summ = a1+a2+a3;
        multiplication = a1*a2*a3;
        System.out.println(summ%2==0 && multiplication%2==0 ? "дважды четное":"не четное");



    }
}
