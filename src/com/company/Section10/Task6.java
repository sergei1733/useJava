package com.company.Section10;
import java.lang.Math;
/*
Задание 10.6
Напишите класс, который генерирует случайное положительное двузначное
число, а затем генерирует три целых двузначных числа, не меньших первого
 */
public class Task6 {
    public static void main(String[] args) {
        int start =10, end = 99, a,b,c,d;
        d = start + (int)((end - start+1)*Math.random());
        System.out.println(d);
        start = d;
        a = start+(int)((end - start + 1)*Math.random());
        b = start+(int)((end - start + 1)*Math.random());
        c = start+(int)((end - start + 1)*Math.random());
        System.out.println(a+" "+b+" "+c);

    }
}
