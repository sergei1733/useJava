package com.company.Section3;
        /*
        Во многих странах для измерения небольших размеров используется
        не только единица длины «сантиметр», но и такая единица, как
        «дюйм» (1 дюйм= 2.54 сантиметра).
        Напишите класс, который принимает с клавиатуры значение, равное
        размеру в дюймах, и затем подсчитывает и выводит на экран это же
        значение, но в сантиметрах.
         */
import java.util.Scanner;

public class Task3_3 {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        double sm,duim;
        System.out.print("введите дюймы ");
        duim=in.nextDouble();
        sm=duim/2.54;
        System.out.println("значение в сантиметрах равно "+sm);


    }
}