package com.company.Section6;
        /*
        Задание 6.14
Напишите класс, который принимает с клавиатуры два значения: первое - числитель дроби, второе - ее
знаменатель (можно исходить из предположения, что второе значение отлично от нуля).
Класс должен определить, является ли эта дробь положительной или
отрицательной, и вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       System.out.print("введите числитель");
       a = in.nextInt();
       System.out.print("введите знаменатель");
       b = in.nextInt();

       if (a * b > 0) System.out.println("дробь положительная");
       else System.out.println("дробь отрицательная");



    }
}