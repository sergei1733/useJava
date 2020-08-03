package com.company.Section15;

import java.util.Scanner;

/*
Задание 15.6
Напишите класс, который принимает с клавиатуры числа, пока небудет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры, чему равна сумма этих
значений (не считая значения 999), и вывести эту информацию на экран.
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int summ = 0, count = 0, x;
        x = in.nextInt();
        while (x!=999){
            count++;
            summ+=x;
            x=in.nextInt();
        }
        System.out.println("сумма "+ summ+ " count "+count);
    }
}
