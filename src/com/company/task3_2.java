package com.company;
        /*
        Во многих странах для измерения небольших размеров используется
        не только единица длины «сантиметр», но и такая единица, как
        «дюйм>> (1дюйм=2.54 сантиметра).
        Напишите класс, который принимает с клавиатуры значение, равное
        размеру в сантиметрах, и затем подсчитывает и выводит на экран это
        же значение, но в дюймах.
         */
import java.util.Scanner;

public class Task3_2 {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        double duim,sm;
        System.out.print("Введите длинну в сантиметрах ");
        sm=in.nextDouble();
        duim=sm*2.54;
        System.out.println("Длинна в дюймах равна "+duim);

    }
}