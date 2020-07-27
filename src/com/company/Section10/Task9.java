package com.company.Section10;
import java.lang.Math;
/*
Задание 10.9
Напиши класс, представляющий версию игры из предыдущего задания -
 только в этом случае компьютер должен играть сам с собой, то
есть и первое значение должно не вводиться с клавиатуры, а
генерироваться классом.
 */
public class Task9 {
    public static void main(String[] args) {
        int start,end,a,b,c;
        a = 10+(int) ((99-10+1)*Math.random());
        System.out.println(a);
        start = a-5;
        end = a+6;
        System.out.println(start+" "+end);
        b = start + (int)((end-start+1)*Math.random());
        System.out.println(a==b?"угадал":"не угадал");
        System.out.println(a>b?"на много меньше":"");
        System.out.println(a<b?"на много больше":"");

    }
}
