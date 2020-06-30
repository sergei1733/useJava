package com.company;
        /*
      Напишите класс, который принимает с клавиатуры два значения:
      первое - длина основания равнобедренного треугольника, второе - высоту
       этого треугольника. Затем класс должен подсчитать и вывести на экран:
        • площадь этого треугольника;
        • периметр прямоугольника, сторонами которого являются основание и
        высота описанного в задаче треугольника.
         */

import java.util.Scanner;

public class Task3_8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, c, h;
        double s, p, b;
        System.out.print("введите длинну основания ");
        a = in.nextInt();
        System.out.print("введите высоту треугольника ");
        h = in.nextInt();
        s = 0.5 * a * h;
        System.out.println("прощадь равна " + s);
        b = Math.sqrt((a * 0.5) * (a * 0.5) + h * h);
        p = a + 2 * b;
        System.out.println("периметр равен " + p);
    }
}