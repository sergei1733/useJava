package com.company.Section8;
        /*
Задание 8.28
Напишите класс, который принимает с клавиатуры два целых положительных числа.
Класс должен определить, могут ли эти числа быть числителем (первое) и
знаменателем (второе) дроби.
В случае если могут, класс должен определить, является ли эта дробь
правильной, неправильной или же она выражает целое число, а также
вывести на экран соответствующее текстовое сообщение.
В случае если числа не могут выражать дробь, следует вывести на экран
соответствующее объяснение.

*/

import javax.swing.*;
import java.util.Scanner;


public class Task28 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,b1,a3;
        double k;
        System.out.print("введите числитель ");
        a = in.nextInt();
        System.out.print("введите знаменатель");
        b = in.nextInt();

        if (b > 0)
        {
            System.out.println("числа подходят для дроби идем дальше");
            if (a > b) System.out.println("дробь не правильная");
            else if (a < b) System.out.println("Дробь правильная");
            else if (a == b) System.out.println("дробь выражает целое число");
        }
            else
                System.out.println("числа не подошли");



      }
    }
