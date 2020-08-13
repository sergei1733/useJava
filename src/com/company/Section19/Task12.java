package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.34
Напишите метод, который принимает в качестве параметра массив
целых чисел и возвращает число ячеек массива, содержащих значения
большие среднего арифметического массива.
 */
public class Task12 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m[], start = 1, end = 10,x;
        x = in.nextInt();
        m = new int[x];
        zapMass(m,start,end);
        output(m);
        int sr = average(m);
        System.out.println("среднее "+sr);
        System.out.println("kol vo " +numberSection(m,sr));
    }
    private static void zapMass(int m[], int start,int end){
        for (int i=0; i<m.length;i++){
            m[i]=start+(int)((end-start+1)*Math.random());
        }
    }
    private static void output(int m[]){
        for (int i=0; i<m.length;i++){
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    private static int average(int m[]){
        int summ = 0;
        for (int i=0;i<m.length;i++){
            summ +=m[i];
        }
        return summ/m.length;
    }
    private static int numberSection(int m[], int sr){
        int count=0;
        for (int i=0; i<m.length;i++){
            if (m[i]>sr) count++;
        }
        return count;
    }
}

