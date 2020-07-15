package com.company.Section8;
        /*
Задание 8.15
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
какая из его двух цифр является большей. В соответствии с результатом проверки надо вывести на
экран соответствующее текстовое сообщение. Не следует выводить на экран
никакого сообщения, если число составлено из одинаковых цифр.
*/

import java.util.Scanner;


public class Task15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
      a = in.nextInt();
      b = a/10;
      c = a%10;
      if (b > c)
          System.out.println("> десятки");
      else if (b < c)
          System.out.println("> единицы");





    }
}