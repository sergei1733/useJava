package com.company.Section4;
        /*
   Напишите класс, который принимает с клавиатуры целое положительное двузначное число.
   Затем следует построить новое значение, составленное из цифр числа, введенного с
   клавиатуры, но в обратном порядке. После этого новое значение следует увеличить на 8,
   и окончательный результат вывести на экран. То есть для числа 37 следует построить число
   73 и вывести на экран 81.
         */

import java.util.Scanner;

public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        a = in.nextInt();
        a1 = (a-a%10)/10;
        a2 = (a%10)*10;
        a3 = a1+a2+8;
        System.out.println(a3);
    }
}