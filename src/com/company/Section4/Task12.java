package com.company.Section4;
        /*
    Назовем «длиной трехзначного числа» разницу между его первой (число сотен) и
    последней (число единиц) цифрами, умноженную на его
    среднюю (число десятков) цифру. Напишите класс, который принимает с клавиатуры целое
    положительное трехзначное число, вычисляет его «длину» и выводит результат на экран.
         */

import java.util.Scanner;

public class Task12 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, a4;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = (a-a1*100)%10;
        a4 = (a1-a3)*a2;
        System.out.println(a4);
    }
}