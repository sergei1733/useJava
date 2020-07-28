package com.company.Section10;
import java.lang.Math;
/*
Задание 10.22
Отрезок в прямоугольной (декартовой) системе координат задается
двумя парами чисел: xl, yl определяют положение (координаты) начала отрезка (точка А), а х2, у2 определяют положение (координаты)
конца отрезка (точка В).
Напишите класс, который генерирует и выводит на экран две пары
случайных целых числа из диапазона от -30 до +30: первая пара - координаты точки А, вторая - координаты точки В.
Класс должен определить (и вывести на экран соответствующую информацию):
• длину отрезка;
• округленную длину отрезка (но не больше истинного!);
• угол (в градусах), который образует отрезок с осью Х;
• какую ось пересекает отрезок, и пересекает ли он какую-либо ось
вообще.
 */
public class Task22 {
    public static void main(String[] args) {
        int start = -30, end = 30, x1,x2,y1,y2;
        double l;
        x1 = start + (int)((end-start+1)*Math.random());
        x2 = start + (int)((end-start+1)*Math.random());
        y1 = start + (int)((end-start+1)*Math.random());
        y2 = start + (int)((end-start+1)*Math.random());
        l = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("длинна "+(int)l);



    }
}
