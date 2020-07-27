package com.company.Section10;

import javax.swing.text.ZoneView;
import java.lang.Math;
import java.util.Scanner;

/*
Задание 10.12
Напишите класс, который повторяет предыдущее задание, но предоставляет игроку получить,
если он того захочет, еще и четвертую карту.
Это, например, можно сделать через ввод с клавиатуры значения, и,
если введено значение 1 (единица), то это означает согласие игрока на
получение четвертой карты.
 */
public class Task12 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start = 1, end = 21, a1, a2, a3, summa, otvet, a4 = 0;
        a1 = start + (int) ((end - start + 1) * Math.random());
        a2 = start + (int) ((end - start + 1) * Math.random());
        a3 = start + (int) ((end - start + 1) * Math.random());
        System.out.println(a1 + " " + a2 + " " + a3);
        summa = a1 + a2 + a3;
        System.out.println(summa);
        System.out.println(summa > 21 ? "перебор" : "");
        System.out.println(summa == 21 ? "очко" : "");
        if (summa < 21) System.out.println("у вас недобор хотите еще карту? 0 - нет, 1 - да");
        otvet = in.nextInt();
        if (otvet == 1)
            a4 = start + (int) ((end - start + 1) * Math.random());
        summa = summa + a4;
        System.out.println(summa < 21 && summa != 21 ? "все равно недобор" : "");
    }
}
