package com.company.Section9;
        /*
    Задание 9.19
Напишите класс, который принимает с клавиатуры два положительных
числа, которые должны быть длинами двух смежных сторон прямоугольника или квадрата. Класс должен определить,
 к какой из указанных двух фигур относятся введенные значения сторон.
*/

import java.util.Scanner;


public class Task19 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();


        System.out.println(a == b ? "квадрат" : "прямоугольник");


    }
}
