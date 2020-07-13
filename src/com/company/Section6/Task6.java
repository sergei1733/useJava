package com.company.Section6;
        /*
        Напишите класс, который принимает с клавиатуры целое число и, если
        оно положительное, увеличивает его вдвое. Класс должен выводить на
        экран новое значение.
*/

import java.util.Scanner;


public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        a = in.nextInt();
        if (a > 0)
            a = a * 2;
        System.out.println(a);



    }
}