package com.company.Section4;
        /*
    Назовем «линейным сдвигом числа влево» операцию, при которой его
    цифры перемещаются на одну позицию влево (единицы - на место
    десятков, десятки - на место сотен, сотни - на место тысяч и так далее) - при этом первая
    цифра удаляется из числа, а на место единиц записывается ноль.
    Например, из числа 1234 после такой операции получается число 2340.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «линейным сдвигом влево».
         */

import java.util.Scanner;


public class Task18 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
        a = in.nextInt();
        a1 = a % 100;
        a2 = a1 * 10;
        System.out.println(a2);


    }
}