package com.company.Section9;
        /*
        Задание 9.5
На каждом этаже многоэтажного дома расположены три квартиры;
счет квартир идет слева направо. Например, на первом этаже квартира
№ 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
справа, и так далее.
Напишите класс, который принимает с клавиатуры номер квартиры и выводит
на экран следующую информацию: на каком этаже она расположена, и какое
место (слева, справа или в центре) она занимает на этом этаже.
*/

import java.util.Scanner;


public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, floor=0;
        String mesto = "";

        a = in.nextInt();
        b = a % 3;

        if (b == 1 || b==2)
            floor = a/3+1;
        else if (b == 0)
            floor = a / 3;

        if (b == 1)
            mesto = "лево";
        else if (b == 2)
            mesto = "центр";
        else if (b == 0)
            mesto = "право";
        System.out.println(" " + mesto + " " + floor);


    }
}
