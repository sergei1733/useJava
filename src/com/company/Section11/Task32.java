package com.company.Section11;
/*
Задание 11.32
Напишите класс, который выводит на экран положительные двузначные числа,
заканчивающиеся на цифру 7 (начиная с наибольшего).
 */
public class Task32 {
    public static void main(String[] args) {
        for (int i = 97; i>=17; i-=10){
            System.out.print(i+" ");
        }
    }
}
