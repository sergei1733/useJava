package com.company.Section11;
import java.lang.Math;
import java.util.Scanner;
/*
Задание 11.6
Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 20 случайных чисел в диапазоне от
первого, только что введенного с клавиатуры, значения, - до второго значения,
также введенного с клавиатуры перед этим. Можно исходить из предположения, что первое
 из вводимых чисел всегда меньше второго.
Например, если с клавиатуры были введены значения -8 и 17, то класс
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
значения).
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int start,end,a;
        start = in.nextInt();
        end = in.nextInt();
        for (int i = 1; i<=20; i++){
            a = start + (int)((end-start+1)*Math.random());
            System.out.println(a);
        }


    }
}
