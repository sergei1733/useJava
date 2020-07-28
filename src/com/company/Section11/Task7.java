package com.company.Section11;
import java.lang.Math;
import java.util.Scanner;
/*
Задание 11.7
Напишите вариант предыдущей задачи, исходя из того, что неизвестно,
какое из вводимых с клавиатуры значений больше, а какое - меньше.
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,start,end,c;
        a = in.nextInt();
        b = in.nextInt();
        if (a>b) {
            start = a;
            end = b;
        }else{
            start = b;
            end = a;
        }
        for (int i = 1; i<=20; i++){
            c = start +(int)((end - start+1)*Math.random());
            System.out.println(c);
        }
    }
}
