package com.company.Section9;
        /*
      Задание 9.9
Напишите класс, который принимает с клавиатуры коэффициенты а и
Ь линейного уравнения (уравнения первой степени - ах+Ь=О) и решает
его, - то есть выводит на экран или корень (корни) уравнения, или
соответствующее смыслу текстовое сообщение.
*/

import java.util.Scanner;


public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if (a == 0 && b == 0) System.out.println("множество решений");
        if (a == 0 && b != 0)
            System.out.println("Heт решения");
        if (a != 0)
            System.out.println(-b / a);
    }
}
