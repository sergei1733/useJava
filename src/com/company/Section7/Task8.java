package com.company.Section7;
        /*
     Задание 7.8
Напишите класс, который принимает с клавиатуры два числа, первое
из которых - количество учеников в классе, а второе - количество
столов в классной комнате. Программа должна проверить, всем ли
ученикам будет, где сесть.
Предполагается, что за столом могут сидеть два ученика.
*/

import java.util.Scanner;


public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();
       if (a/2 == b) System.out.println("хватает столов");
       else
           System.out.println("не хватает");



    }
}