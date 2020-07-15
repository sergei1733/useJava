package com.company.Section6;
        /*
        Задание 6.12
Напишите класс, который принимает с клавиатуры три значения (а, Ь
и с), являющиеся коэффициентами квадратного уравнения.
Класс должен определить, имеется ли у этого уравнения хотя бы один
корень (решение), и вывести на экран соответствующее текстовое сообщение.
*/

import java.util.Scanner;


public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        a1 = b*b -4*a*c;
        if (a1 > 0) System.out.println("есть решение");


    }
}