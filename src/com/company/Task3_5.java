package com.company;
        /*
        Напишите класс, который принимает с клавиатуры три числа: длины
        двух катетов и гипотенузы прямоугольного треугольника, и выводит
        на экран площадь и периметр этого треугольника.
        При решении следует предусмотреть возможность того, что размеры
        сторон треугольника не выражаются целыми числами.
         */
import java.util.Scanner;

public class Task3_5 {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
    double a,b,c,area,perimeter;
    System.out.print("введите длины катетов ");
    a=in.nextDouble();
    b=in.nextDouble();
    System.out.print("введите длинну гитепленузы ");
    c=in.nextDouble();

    area=0.5*a*b;
    perimeter=a+b+c;

    System.out.println("периметр треугольника равен "+perimeter);
    System.out.println("площадь треугольника равна "+area);
    }
}