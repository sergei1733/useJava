package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.10
Напишите класс, который принимает с клавиатуры число для переменной Х, а затем дополнительную
серию чисел, каждое из которых используется для уменьшения значения переменной Х. Ввод чисел
должен производиться до тех пор, пока значение переменной Х остается положительным.
 */
public class Task8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a;
        x = in.nextInt();
        while (x>0){
            a = in.nextInt();
            x-=a;
            System.out.print(x+" ");
        }
    }
}
