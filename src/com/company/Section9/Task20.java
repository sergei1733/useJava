package com.company.Section9;
        /*
    Задание 9.20
Напишите класс, который принимает с клавиатуры промежуток времени, выраженный в секундах, и выводит на экран
его же, но выраженный в минутах и секундах. Если промежуток времени превышает час, то надо не производить
пересчет, а просто вывести на экран текстовое сообщение Расчет не производится.
*/

import java.util.Scanner;


public class Task20 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;

        a = in.nextInt();
        a1 = a/60;
        a2 = a-a1*60;

        System.out.println(a > 3600 ? "расчет не производится" : ""+a1+" мин "+a2 +" сек");


    }
}
