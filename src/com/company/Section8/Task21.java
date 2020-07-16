package com.company.Section8;
        /*
Задание 8.21
Напишите класс, который принимает с клавиатуры положительное
целое число и выводит на экран ближайшее к нему «крутлое число».
Например, для введенного значения 433 выводится на экран 430, а для
56 выводится 60.
*/

import java.util.Scanner;


public class Task21 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a/10;
      c = a%10;

      if (c >= 0 && c <=5)
          b = a1 * 10;
      else
          b = (a1 + 1) * 10;
      System.out.println(b);







    }
}