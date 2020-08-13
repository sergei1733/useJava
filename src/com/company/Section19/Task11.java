package com.company.Section19;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Задание 19.27
Напишите метод, который принимает в качестве параметра массив
целых чисел М и целое число К (номер одной из ячеек массива).
Метод возвращает сумму значений, расположенных в ячейках массива
от начальной - до ячейки номер К.
 */
public class Task11 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m[], start = 1, end = 10, k,x;
        x = in.nextInt();
        m = new int[x];
        k = in.nextInt();
        zapMass(m,start,end);
        System.out.println(out(m,k));
    }
    private static void zapMass(int m[], int start, int end){
        for (int i=0; i<m.length;i++){
            m[i] = start+(int)((end-start+1)*Math.random());
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    private static int out(int m[], int k){
        int summ=0;
        for (int i=0; i<k;i++){
            summ+=m[i];
        }
        return summ;
    }
}
