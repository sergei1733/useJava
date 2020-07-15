package com.company.Section8;
        /*
Напишите класс, который принимает с клавиатуры два целых положительных
числа и затем выводит на экран:
• разницу между первым и вторым, - в случае если первое больше
второго;
• разницу между вторым и первым, - в случае если второе больше
первого;
• произведение введенных значений, - в случае если они равны.

*/

import java.util.Scanner;


public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1;
       a = in.nextInt();
       b = in.nextInt();

       if (a > b)
           System.out.println(a - b);
       else if (b > a)
           System.out.println(b - a);
       else
           System.out.println(a * b);


    }
}