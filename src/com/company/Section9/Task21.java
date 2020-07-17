package com.company.Section9;
        /*
    Задание 9 .21
Напишите класс, который принимает с клавиатуры временной интервал, выраженный в секундах, и выводит на
экран тот же интервал, но выраженный в часах, минутах и секундах. Если промежуток времени превышает
сутки, то надо не производить  пересчет, а просто вывести на экран текстовое сообщение Расчет не производится.
*/

import java.util.Scanner;


public class Task21 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, clok, minutes, seconds;

        a = in.nextInt();
        clok = a / 3600;
        minutes = (a- clok*3600) / 60;
        seconds = a - (clok * 3600 + minutes* 60);
        System.out.println(a > 86400 ? "расчет не производится" : ""+clok+" час " + minutes + " мин " + seconds + " сек");


    }
}
