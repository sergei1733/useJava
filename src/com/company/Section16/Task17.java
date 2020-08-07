package com.company.Section16;

import java.lang.Math;

/*
Задание 16.20
В классе 35 учеников. В конце учебного года каждый ученик получает
ведомость с оценками по 8 предметам.
Напишите класс, который генерирует по 8 оценок для каждого ученика
и подсчитывает для него среднюю годовую оценку.
Для каждого ученика класс должен выводить на экран в одну строку
оценки каждого ученика и его среднюю годовую оценку.
После завершения вывода на экран оценок всех учеников класс должен
выводить в отдельной строке количество учеников, у которых среднегодовая оценка
выше 4.5, и наивысшую среднегодовую оценку.
 */
public class Task17 {
    public static void main(String[] args) {
        int a, start = 2, end = 5,count = 0;
        double sr = 0,max = 0;
        for (int i = 1; i <= 35; i++) {
            System.out.print(i + " Ученик ");
            double summ = 0;
            for (int j = 1; j <= 8; j++) {
                a = start + (int) ((end - start + 1) * Math.random());
                System.out.print(a + " ");
                summ += a;
            }
            sr = summ/8;
            System.out.print(" " + sr);
            if (sr>max) max = sr;
            if (sr>4.5) count++;
            System.out.println();
        }
        System.out.println(" количество учеников с оценкой больше 4.5 "+count);
        System.out.println("max "+ max);

    }
}
