package com.company.Section9;
/*
Задание 9 .2 7
Напишите класс, который принимает с клавиатуры два положительных
числа - двузначное и четырехзначное - и проверяет, сколько раз двузначное число фигурирует
как «внутреннее» по отношению к четырехзначному.
 */
import java.lang.invoke.SerializedLambda;
import java.util.Scanner;
public class Task27 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    int a,a1,a2,a3,a4,b,c=0;
    a = in.nextInt();
    b = in.nextInt();
    a1 = a/1000;
    a2 = a/100%10;
    a3 = (a-(a1*1000+a2*100))/10;
    a4 = (a-(a1*1000+a2*100))%10;
    if (a1*10+a2==b) c++;
    if (a2*10+a3==b) c++;
    if (a3*10+a4==b) c++;
        System.out.println(c);
    }

}
