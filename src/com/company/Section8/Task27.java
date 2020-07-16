package com.company.Section8;
        /*
Задание 8.2 7
ЗНапишите класс, который принимает в качестве параметров два целых
положительных числа и выводит на экран с дополнительным сообщением
то из них, у которого наибольшая последняя цифра (число единиц).
Если такого числа нет, класс должен вывести на экран соответствующее сообщение.

*/

import java.util.Scanner;


public class Task27 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,b1,a3;
        double k;
        a = in.nextInt();
        b = in.nextInt();
        a1 = a % 10;
        b1 = b % 10;
        if (a1 > b1) System.out.println(a);
        else if (b1 > a1) System.out.println(b);
        else System.out.println("числа равны");

      }
    }
