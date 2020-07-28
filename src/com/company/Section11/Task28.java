package com.company.Section11;
import javax.naming.ServiceUnavailableException;
import java.util.Scanner;
/*
Задание 11.28
Напишите класс, который принимает с клавиатуры целое положительное число, а затем выводит на
экран все целые положительные трехзначные числа, сумма цифр которых равна введенному с клавиатуры
значению.
 */
public class Task28 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a1,a2,a3,summ;
        x = in.nextInt();
        for (int i = 100; i<=999;i++){
            a1 = i/100;
            a2 = (i%100)/10;
            a3 = i%10;
            summ = a1+a2+a3;
            System.out.print(summ==x?i+" ":"");

        }
    }
}
