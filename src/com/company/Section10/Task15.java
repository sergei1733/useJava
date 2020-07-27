package com.company.Section10;
import java.lang.Math;
/*
Задание 10.15
Напишите класс, который генерирует и выводит на экран случайное число из диапазона
от 250 до 746, а затем в отдельных строках, - наименьшую и наибольшую из цифр этого числа.
Класс также должен проверить, были ли в генерированном числе одинаковые цифры, и вывести на экран
соответствующее текстовое сообщение.
 */
public class Task15 {
    public static void main(String[] args) {
        int start = 250, end = 746, a, a1, a2, a3;
        a = start + (int)((end-start+1)*Math.random());
        a1 = a/100;
        a2 = (a-a1*100)/10;
        a3 = a%10;
        if (a1<a2 && a1<a3) System.out.println(a1+" наименьшее");
        if (a2<a1 && a2<a3) System.out.println(a2+" наименьшее");
        if (a3<a1 && a3<a2) System.out.println(a3+" наименьшее");

        if (a1>a2 && a1>a3) System.out.println(a1+" наибольшее");
        if (a2>a1 && a2>a3) System.out.println(a2+" наибольшее");
        if (a3>a1 && a3>a2) System.out.println(a3+" наибольшее");

        System.out.println(a+" "+a1+" "+a2+" "+a3);
    }
}
