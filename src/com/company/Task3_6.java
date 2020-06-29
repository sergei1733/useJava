package com.company;
        /*
        Напишите класс, который принимает с клавиатуры целое число и выводит
        на экран (в одной строке) три следующих за ним целых числа так,
        чтобы разница между каждым числом и следующим за ним составляла 2.
        Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
         */
import java.util.Scanner;

public class Task3_6 {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
    int a,a1,a2,a3;
    a=in.nextInt();
    a1=a+2;
    a2=a1+2;
    a3=a2+2;
    System.out.println(a1+" "+a2+" "+a3);
    }
}