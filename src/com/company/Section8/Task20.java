package com.company.Section8;
        /*
Задание 8.20
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
 содержится ли в нем хотя бы один ноль.
По результатам проверки надо вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task20 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a/100;
      a2 = a%100/10;
      a3 = a%10;
      if (a1 > 0 && a2 > 0 && a3 > 0)
          System.out.println("в числе нет нулей");
      else
          System.out.println("есть нули");







    }
}