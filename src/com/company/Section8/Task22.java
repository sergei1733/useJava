package com.company.Section8;
        /*
Задание 8.22
Напишите класс, который принимает с клавиатуры целое положительное число и
изменяет его следующим образом:
• для четного числа - увеличивает его до ближайшего «крутлого» и
выводит новое значение на экран вместе с сообщением Up to."
• для нечетного числа - уменьшает его до ближайшего «крутлого» и
выводит новое значение на экран вместе с сообщением Down to".
Например, для введенного значения 433 на экран выводится Down to
430, а для 56 выводится Up to 60.

*/

import java.util.Scanner;


public class Task22 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a / 10;

      if (a % 2 == 0)
          if (a % 10 >= 5)
              System.out.println((a1 + 1)*10 + " up to");
          else
              System.out.println(a1 * 10 + " up to");

      else
          if (a % 10 >= 5)
              System.out.println((a1 + 1)*10 + " Down to");
          else
              System.out.println(a1 * 10 + " Down to");







    }
}