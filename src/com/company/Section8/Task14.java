package com.company.Section8;
        /*
Задание 8.14
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
 является ли в нем первая цифра (десятков) больше второй (единиц). В соответствии с результатом
 проверки надо вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task14 {
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
      else
          System.out.println("они равны");




    }
}