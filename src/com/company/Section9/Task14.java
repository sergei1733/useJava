package com.company.Section9;
        /*
    Задание 9.14
Определим «текстовую форму оценки» следующим образом: 1 или 2 -
«неудовлетворительно», 3 - «удовлетворительно», 4 - «хорошо», 5 -
«ОТЛИЧНО».
Напишите класс, который принимает с клавиатуры целое число и, если
оно соответствует оценке, выводит на экран соответствующую «тек-стовую форму оценки».
В случае если число не является оценкой, следует вывести на экран соответствующее текстовое
сообщение.
*/

import java.util.Scanner;


public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        if (a > 0 && a <= 5) {
            if (a == 1 || a == 2) System.out.println("не удовлетворительно");
            else if (a == 3) System.out.println("удовлетворительно");
            else if (a == 4) System.out.println("Хорошо");
            else System.out.println("Отлично");
        }
        else System.out.println("это не оценка");


    }
}
