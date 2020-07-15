package com.company.Section8;
        /*
Задание 8.12
Напишите класс, который принимает с клавиатуры оценку ученика
(целое число) и проверяет, не является ли введенное значение ошибочным.
На экран должно выводиться соответствующее текстовое сообщение.

*/

import java.util.Scanner;


public class Task12 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
      a = in.nextInt();
      if (a >= 2 && a <= 5) System.out.println("оценка коректная");
          else
              System.out.println("Оценка ошибочна");



    }
}