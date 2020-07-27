package com.company.Section10;
import org.w3c.dom.ls.LSOutput;

import java.lang.Math;
import  java.util.Scanner;
/*
Задание 10.8
Напишите класс, который принимает с клавиатуры целое число и затем
генерирует («придумывает>>) случайное число из следующего диапазона:
• «центром диапазона» является введенное с клавиатуры число;
• количество чисел в диапазоне равно 11.
Класс должен определять, «угадал» ли компьютер введенное число и
выводить на экран одно из сообщений (в зависимости от соотношения
введенного и «придуманного» чисел):
• угадал - если числа совпали;
• слишком большое - если «придуманное» компьютером число
больше введенного с клавиатуры;
• слишком маленькое - если «придуманное» компьютером число
меньше введенного с клавиатуры.
 */
public class Task8 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int start,end,a,b;
        a = in.nextInt();
        start = a-5;
        end = a+6;
        System.out.println(start+" "+end);
        b = start + (int)((end - start+1)*Math.random());
        System.out.println(b);
        System.out.println(a==b?"угадал":"не угадал");
        System.out.println(a!=b && b>a?"слишком большое число":"");
        System.out.println(a!=b && b<a?"слишком маленькое":"");


    }
}
