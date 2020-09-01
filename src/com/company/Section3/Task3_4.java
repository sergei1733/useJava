package com.company.Section3;
        /*
        Для пересчета суммы в одной валюте - в сумму в другой валюте
        (например, между суммой в рублях и этой же суммой, но в евро)
        используется так называемый «банковский курс»: числовой коэффициент,
        показывающий, чему равна единица одной валюты в единицах другой.
        Напишите класс, который принимает с клавиатуры два числа: первое -
        сумму в одной валюте (например, в долларах), и второе - «банковский
        курс». Класс должен подсчитать и вывести на экран сумму во второй
        валюте.
         */
import java.util.Scanner;

public class Task3_4 {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        double summa, course, result;
        System.out.print("Введите сумму ");
        summa=in.nextDouble();
        System.out.print("введите курс валюты ");
        course=in.nextDouble();
        result=summa/course;
        System.out.println("Результат пересчета по курсу "+result);



    }
}