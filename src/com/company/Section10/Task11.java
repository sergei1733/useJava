package com.company.Section10;
import org.w3c.dom.ls.LSOutput;

import java.lang.Math;
/*
Задание 10.11
Как известно, при игре в «двадцать одно» («очко») у каждой карты есть
численное значение.
Напишите класс, который «выбрасывает три карты» (генерирует три
случайных числа - в каких пределах?) и определяет, какой из вариантов (недобор, перебор, «очко»)
 реализовался.
 */
public class Task11 {
    public static void main(String[] args) {
        int start = 1, end = 21, a1,a2,a3,summa;
        a1 = start+(int)((end-start+1)*Math.random());
        a2 = start+(int)((end-start+1)*Math.random());
        a3 = start+(int)((end-start+1)*Math.random());
        System.out.println(a1+" "+a2+" "+a3);
        summa = a1+a2+a3;
        System.out.println(summa);
        System.out.println(summa>21?"перебор":"");
        System.out.println(summa<21?"недобор":"");
        System.out.println(summa==21?"очко":"");
    }
}
