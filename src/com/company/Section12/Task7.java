package com.company.Section12;
import java.util.Scanner;
/*
Задание 12.16
Напишите класс, который принимает с клавиатуры целое положительное число и определяет,
является ли оно простым.
Класс должен вывести на экран соответствующее текстовое сообщение.
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, count = 0;
        x = in.nextInt();
        for (int i = 1; i<=x; i++){
            if (x%i == 0)
                count++;
        }
        System.out.println(count==2?count+" простое число":count+" нет");
    }
}
