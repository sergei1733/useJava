package com.company.Section14;
import java.lang.Math;
/*
Задание 14.4
Напишите класс, который генерирует серию из 50 случайных целых
чисел из диапазона от -40 до +40, и определяет наибольшее из положительных значений в сгенерированной
серии, а также наименьшее из отрицательных значений в сгенерированной серии.
В случае если одно из нужных значений невозможно определить
(почему?}, следует вывести на экран соответствующее текстовое сообщение.
 */
public class Task3 {
    public static void main(String[] args) {
        int  start = -40, end = 40, min = 0, max =  0, x;
        for (int i=1; i<=50; i++){
            x = start +(int)((end-start+1)*Math.random());
            if (x<0 && x< min) min=x;
            if (x>0 && x>max) max = x;
        }
        System.out.println(min==0?"нет":" min "+min);
        System.out.println(max==0?"нет":" max "+max);
    }
}
