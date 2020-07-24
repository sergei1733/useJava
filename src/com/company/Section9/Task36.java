package com.company.Section9;
import java.util.Scanner;
/*Задание 9.36
Напишите класс, который принимает с клавиатуры два строковых значения, каждое из
которых содержит имя человека, и проверяет, являются ли эти люди тезками.
По результатам проверки следует вывести на экран соответствующее сообщение.

 */
public class Task36 {
public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       String str1 = "",str2 = "";
        str1 = in.next();
        str2 = in.next();
        System.out.println(str1.equals(str2)?"да":"нет");
    }

    }

