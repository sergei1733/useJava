package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.45
Напишите метод, который принимает в качестве параметра массив
целых чисел и сдвигает все элементы массива, кроме последнего, на
одну позицию вправо. Значение, находившееся в последней ячейке
массива, переходит в первую ячейку (правый сдвиг).
 */
public class Task16 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m[],a;
        m = new int[]{1,2,3,6,5,4,8,9};
        a = m[m.length-1];
        sortMass(m,a);
        outMass(m);
    }
    private static void sortMass(int m[],int a){
        for (int i = m.length-1; i>=1;i--)
            m[i]=m[i-1];
        m[0]=a;
    }
    private static void outMass(int m[]){
        for (int z:m) {
            System.out.print(z+" ");
        }
    }
}
