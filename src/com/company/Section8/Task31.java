package com.company.Section8;
        /*
Задание 8.31
Напишите класс, который принимает с клавиатуры трехзначное число
и изменяет его следующим образом:
• для четных чисел - все четные цифры увеличиваются на 1, а нечетные уменьшаются
на 1; в случае если это невозможно, они остаются неизменными;
• в нечетных числах все изменения производятся «наоборот».
Программа должна вывести на экран новое значение переменной.
*/

import java.util.Scanner;


public class Task31 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, a1, a2, a3;
        double k;
        System.out.print("введите числитель ");
        a = in.nextInt();
        a1 = a / 100;
        a2 = a % 100 / 10;
        a3 = a % 10;
        if (a % 2 == 0)
        {
            if (a1 % 2 == 0) a1 ++; else if (a1 != 0) a1 --;
            if (a2 % 2 == 0) a2 ++; else if (a1 != 0) a1 --;
            if (a3 % 2 == 0) a3 ++; else if (a1 != 0) a1 --;
        }
        else {
            if (a1 % 2 == 0 && (a1 != 0)) a1--;
            else a1++;
            if (a2 % 2 == 0 && (a2 != 0)) a2--;
            else a2++;
            if (a3 % 2 == 0 && (a3 != 0)) a3--;
            else a3++;
        }
        b = a1*100+a2*10+a3;
    System.out.println(b);


      }
    }
