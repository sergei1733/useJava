package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.39
Напишите метод, который принимает в качестве параметра массив
целых чисел и «переворачивает» его.
Например, если в качестве параметра получен массив 1, 3, 6, 2, 7, после
окончания работы метода содержимое массива будет 7, 2, 6, 3, 1.
 */
public class Task13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m[], x, start=1, end=10;
        x = in.nextInt();
        m = new int[x];
        zapMass(m,start,end);
        out(m,x);
    }
    private static void zapMass(int m[], int start,int end){
        for (int i=0; i<m.length;i++){
            m[i]=start+(int)((end-start+1)*Math.random());
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    private static void out(int m[],int x){
       int j, mv[];
       mv = new int[x];
       j= m.length-1;
       System.out.println(j);
       for (int i = 0;i<m.length; i++){
           mv[j] = m[i];
           j--;
       }
       for (int i=0;i<mv.length;i++){
           System.out.print(mv[i]+" ");
       }



    }
}
