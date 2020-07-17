package com.company.Section9;
        /*
     Задание 9.11
Трехзначное число называется «плоским», если оно составлено из
одинаковых цифр. Напишите класс, который принимает с клавиатуры
трехзначное число и проверяет, является ли оно «плоским». В
соответствии с результатом проверки надо вывести на экран
соответствующеетекстовое сообщение.
*/

import java.util.Scanner;


public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2,a3;
        a = in.nextInt();
        a1= a/100;
        a2=(a-a1*100)/10;
        a3=a%10;
        if (a1==a2 && a1==a3)
            System.out.println("число плоское");
        else
            System.out.println("не плоское");



     }
}
