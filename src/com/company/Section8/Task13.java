package com.company.Section8;
        /*
Задание 8.13
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
составлено ли оно из одинаковых цифр.
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
      a = in.nextInt();
      b = a/10;
      c = a%10;
      if (b == c)
          System.out.println("число составлено из одинаковых циыр");
      else
          System.out.println("число составлено из разных цыфр");




    }
}