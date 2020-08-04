package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.26
Напишите класс, который принимает с клавиатуры целое положительное число, а затем
генерирует случайную цифру. Класс должен определить, встречается ли во введенном с
клавиатуры числе сгенерированная цифра, и вывести на экран соответствующее сообщение.
 */
public class Task24 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start =1, end = 9, x, a, k, count = 0;
        x = in.nextInt();
        a = start +(int)((end-start+1)*Math.random());
        while (x>0){
            k = x%10;
            x/=10;
            if (a == k) count++;
        }
        System.out.println(a);
        System.out.println(count>0?"да":"нет");
    }
}
