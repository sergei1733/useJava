package com.company.Section6;
        /*
        Трехзначное положительное число называется «четно-красивым», если
каждая из его цифр - четная. Напишите класс, который принимает с
клавиатуры трехзначное число и проверяет, является ли оно «четнокрасивым».
В соответствии с результатом проверки надо вывести на
экран соответствующее текстовое сообщение.
Обратите внимание: задание имеет решение с использованием одного
оператора if и без составного условия!
*/

import java.util.Scanner;


public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,a1,a2,a3,c;
        a = in.nextInt();
        a1 = ( a / 100 ) % 2;
        a2 = ( a % 100 / 10 ) % 2;
        a3 = ( a % 10 ) % 2;
        c = a1 + a2 + a3;
        if (c == 0 )
        System.out.println(" является четнокрасивым");



    }
}