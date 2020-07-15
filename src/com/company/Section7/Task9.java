package com.company.Section7;
        /*
     Задание 7.9
Напишите класс, который принимает с клавиатуры три числа: два первых должны быть длинами
сторон катетов прямоугольного треугольника, а третье - длиной гипотенузы. Программа должна проверить,
соответствуют ли введенные значения этому требованию.
Внимание: допустимо предположить, что все вводимые чиО1а - положительные.
*/

import java.util.Scanner;


public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();
       c = in.nextInt();

       if (c * c == a * a + b * b) System.out.println("это прямоугольный треугольник");
       else
           System.out.println("это не прямоугольный треугольник");



    }
}