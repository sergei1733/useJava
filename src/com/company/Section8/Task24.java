package com.company.Section8;
        /*
Задание 8.24
Напишите класс, который принимает с клавиатуры целое трехзначное
положительное число и изменяет его следующим образом:
• для чисел, больших 500, - переставляет местами числа единиц и
сотен (вместо 672 - 276);
• в остальных числах переставляются местами числа десятков и
единиц (вместо 363 - 336).
Программа должна вывести на экран новое значение переменной.

*/

import java.util.Scanner;


public class Task24 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a / 100;
      a2 = a % 100 / 10;
      a3 = a % 10;
      if (a > 500)
          b = a3 * 100 + a2 * 10 +a1;
      else
          b = a1 * 100 + a3 * 10 + a2;
      System.out.println(b);
    }
}