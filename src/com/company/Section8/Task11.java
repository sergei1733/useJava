package com.company.Section8;
        /*
Задание 8.11
Напишите класс, который принимает с клавиатуры два числа: первое -
количество учеников в классе, второе - количество стульев в классной комнате.
Программа проверит соответствие между этими двумя значениями и
выведет на экран соответствующую информацию (например, для значений 35 и 39 на
экран выводится 4 стула лишних).
*/

import java.util.Scanner;


public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       System.out.println("ученики ");
       a = in.nextInt();
       System.out.println("стулья ");
       b = in.nextInt();
       if (a == b)
           System.out.println("количество учеников и стульев совпадлает");
       else if (a > b)
           System.out.println(a - b + " не хватает стульев");
       else
           System.out.println(b - a + " лишних стула");



    }
}