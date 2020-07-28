package com.company.Section11;
/*
Задание 11.31
Напишите класс, который выводит на экран положительные двузначные числа, заканчивающиеся
на цифру 7 (начиная с наименьшего).
 */
public class Task31 {
    public static void main(String[] args) {
        for (int i=17; i<=97;i+=10){
            System.out.print(i+" ");
        }
    }
}
