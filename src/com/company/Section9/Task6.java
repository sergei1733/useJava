package com.company.Section9;
        /*
        Задание 9.6
Напишите класс, который принимает с клавиатуры три положительных
 числа и проверяет, могут ли они являться длинами сторон треугольника.
  По результатам проверки следует вывести на экран соответствующее текстовое
  сообщение.
*/

import javax.swing.*;
import java.util.Scanner;


public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();

        if ((a+b)>c && (a+c)>b && (b+c)>a)
            System.out.println("могут");
        else
            System.out.println("нет");


    }
}
