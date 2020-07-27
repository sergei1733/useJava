package com.company.Section10;
import java.lang.Math;
/*
Задание 10.17
Напишите класс, который генерирует длины сторон катетов прямоугольного треугольника так,
чтобы длина катета не превышала 10.5 см. Класс должен подсчитать длину гипотенузы этого
треугольника, его площадь и периметр и вывести их на экран. Затем эти вычисленные значения
следует округлить и вывести результат на экран в отдельной строке вместе с соответствующим
текстовым сообщением.
 */
public class Task17 {
    public static void main(String[] args) {
        double start = 1, end = 10.5, a,b,c,p;
        a = start + ((end)*Math.random());
        b = start + ((end)*Math.random());
        c = Math.round(Math.sqrt(a*a+b*b));
        p = Math.round(a+b+c);
        System.out.println("гипотенуза "+c);
        System.out.println("периметр "+p);
        System.out.println(a+" "+b);


    }
}
