package com.company.Section8;
        /*
Задание 8.18
Назовем «степенью четности» числа количество четных цифр в его составе (например, степень
четности для 2346 равна 3). Напишите класс, который принимает с клавиатуры трехзначное
положительное число и определяет, какова его «степень четностю>. В соответствии с результатом
проверки надо вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task18 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a/100;
      a2 = a%100/10;
      a3 = a%100%10;
      c = (a1+a2+a3)%2;
      b = a%2;
      if (a1%2 ==0 && a2%2==0 && a3%2 ==0)
          System.out.println("степень 3");
      else if (a1 % 2 == 0 && a2 % 2 == 0 || a1 % 2 == 0 && a3 % 2 == 0 || a2 % 2 == 0 && a3 % 2 == 0 )
          System.out.println("степень 2");
      else if (a1%2 ==0 || a2%2==0 || a3%2 ==0)
          System.out.println("степень1");
      else
          System.out.println("число не четное");






    }
}