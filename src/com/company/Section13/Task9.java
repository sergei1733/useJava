package com.company.Section13;

import java.util.Scanner;

/*
Задание 13.28
Напишите класс, который принимает с клавиатуры две пары целых чисел:
• первая пара - значение и порядковый номер одного члена арифметической прогрессии;
• вторая пара - значение и порядковый номер другого члена этой
же прогрессии.
Класс должен вывести на экран все члены этой арифметической прогрессии, расположенные
между двумя введенными.
В случае если речь идет о двух соседних членах, на экран следует вывести соответствующее
текстовое сообщение.
 */
public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, b, b1;
        a = in.nextInt();
        a1 = in.nextInt();
        b = in.nextInt();
        b1 = in.nextInt();
        if (b - a == 1) System.out.println("сщседнии члены");
        else {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
