package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.5
Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры (не считая значения 999),
и вывести эту информацию на экран.
 */
public class Task3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, count = 0;
        x = in.nextInt();
        while (x!=999){
            count++;
            x = in.nextInt();
        }
        System.out.println(count);
    }
}
