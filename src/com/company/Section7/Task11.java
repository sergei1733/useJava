package com.company.Section7;
        /*
    Задание 7.11
Напишите класс, который принимает с клавиатуры два различных числа.
Класс должен вывести на экран эти числа в порядке возрастания -
в одной строке, а в другой - их же, но в порядке убывания.

*/

import java.util.Scanner;


public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();
       if (a > b) {
           System.out.println(b + " " + a);
           System.out.println(a + " " + b);
       }
           else {
           System.out.println(a + " " + b);
           System.out.println(b + " " + a);
       }


    }
}