package com.company.Section13;
import java.util.Scanner;
/*
Задание 13.10
Назовем «степенью близости» двух целых положительных чисел сумму их общих делителей.
Напишите класс, который принимает с клавиатуры два целых положительных числа и
 определяет их «степень близости».
 */
public class Task5 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,y,summ=0,a;
        x = in.nextInt();
        y = in.nextInt();
        if (x>y) a=x; else a=y;
        for (int i=1;i<=a;i++){
            if (x%i==0 && y%i==0) {
                summ +=i;
                System.out.print(i +" ");}
        }
        System.out.println(summ);
    }
}
