package com.company.Section13;
import java.util.Scanner;
/*
Задание 13.15
Напишите класс, который принимает с клавиатуры двузначное положительное целое число Х,
составленное из разных цифр, и возвращает
сумму однозначных чисел, заключенных между цифрами этого числа Х
(включая сами цифры, из которых составлено число Х).
Например, и для числа 52, и для числа 25 будет возвращено значение
14 (2 + 3 + 4 + 5 = 14)
 */
public class Task7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,a1,a2,summ = 0,k,k1;

        x = in.nextInt();
        a1 = x/10;
        a2 = x%10;
        if (a1>a2) {
            k = a1;
            k1 = a2;
        }
        else {
            k = a2;
            k1 = a1;
        }

        for (int i = k1; i<=k;i++){
            summ+=i;
        }
        System.out.println(summ);


    }
}
