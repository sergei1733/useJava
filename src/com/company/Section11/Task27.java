package com.company.Section11;
import java.util.Scanner;
/*
Задание 11.27
Напишите класс, который принимает с клавиатуры целое положительное число, а затем выводит на экран все целые положительные двузначные числа, сумма цифр которых равна введенному с клавиатуры
значению.
 */
public class Task27 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a1,a2;
        x = in.nextInt();
        for (int i = 10; i<=99; i++){
            a1 = i/10;
            a2 = i%10;
            System.out.print(a1+a2 == x?" "+ i:"");
        }
    }
}
