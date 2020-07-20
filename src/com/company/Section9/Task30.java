package com.company.Section9;
import java.util.Scanner;
/*
Задание 9.30
Напишите класс, который принимает с клавиатуры трехзначное число
и проверяет, на какое число из составляющих его цифр оно делится
(без остатка).
Следует учесть возможность того, что одной из цифр в проверяемом
числе может быть и О.
 */
public class Task30 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,a1,a2,a3,b;
        a = in.nextInt();
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = a%10;
        System.out.println(a1!=0 && a%a1==0?"дилится на 1 число":"не долится на 1 число");
        System.out.println(a2!=0 && a%a2==0?"дилится на 2 число":"не долится на 2 число");
        System.out.println(a3!=0 && a%a3==0?"дилится на 3 число":"не долится на 3 число");

    }

}
