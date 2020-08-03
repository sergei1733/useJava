package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.20
Напишите класс, который вводит с клавиатуры целые положительные
числа до тех пор, пока не будет введено число, сумма цифр которого
равна 5
 */
public class Task18 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, summ = 0,a;
        while (summ!=5){
            summ=0;
            x = in.nextInt();
          while (x>0){
              a = x%10;
              summ +=a;
              x = x/10;
          }
        }



    }
}
