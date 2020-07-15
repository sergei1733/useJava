package com.company.Section8;
        /*
Задание 8.16
Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
является ли оно «симметричным». В соответствии с результатом проверки надо вывести на экран
соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task16 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
      a = in.nextInt();
      b = a/100;
      c = a%100%10;
      if (b == c)
          System.out.println("число симметрично");






    }
}