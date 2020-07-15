package com.company.Section7;
        /*
        Задание 7.7
Напишите класс, который принимает с клавиатуры два числа, первое
из которых - количество учеников в классе, а второе - количество
стульев в классной комнате. Программа должна проверить, всем ли
ученикам будет, где сесть.
*/

import java.util.Scanner;


public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();
       if (a == b) System.out.println("хватает стулев");
       else
           System.out.println("не хватает");



    }
}