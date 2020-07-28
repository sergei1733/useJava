package com.company.Section11;
import java.lang.Math;
import java.util.Scanner;
/*
Задание 11.38
Напишите класс, который принимает с клавиатуры целое число, а затем генерирует 15 случайных чисел
из диапазона положительных трехзначных чисел.Для тех сгенерированных чисел, которые делятся на
введенное с клавиатуры значение, следует вывести на экран округленный в большую сторону квадратный
корень из первой цифры (число сотен), для остальных - округленный в меньшую сторону квадратный корень из
второй цифры (число десятков).
 */
public class Task38 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int  start = 100,end = 999, x,a,a1,a2,a3;
        x = in.nextInt();
        for (int i=1;i<=15; i++){
            a = start + (int)((end-start+1)*Math.random());
            a1 = a/100;
            a2 = (a%100)/10;
            if (a%x==0) {
                System.out.println(Math.ceil(Math.sqrt(a1)) + " " + a);
            }else
                System.out.println(Math.floor(Math.sqrt(a2))+" "+a);




        }


    }
}
