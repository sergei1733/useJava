package com.company.Section8;
        /*
Задание 8.2 5
Напишите класс, который принимает с клавиатуры целое положительное число, и затем:
• в случае если введено четное число, - принимает с клавиатуры
дробное число и выводит на экран произведение этих двух чисел;
• в противном случае - принимает с клавиатуры целое число и выводит на экран
сумму этих двух чисел.

*/

import java.util.Scanner;


public class Task25 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
        double k;
      a = in.nextInt();
      b = a % 2;
      if (b == 0) {
          System.out.print("введите дробное число");
          k = in.nextDouble();
          System.out.println(a * k);
      }
      else {
          System.out.print("введите целое число");
          a1 = in.nextInt();
          System.out.println(a1 + a);
      }

      }
    }
