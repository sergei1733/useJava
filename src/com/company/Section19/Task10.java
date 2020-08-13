package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.26
Напишите метод, который принимает в качестве параметра массив
целых чисел М и целое число Х и проверяет, встречается ли в массиве
пара чисел, произведение которых равно Х (эти числа необязательно
расположены в смежных ячейках).
 */
public class Task10 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n,m[], x, start=1, end = 10;
        n = in.nextInt();
        m = new int[n];
        x = in.nextInt();
        zappMass(m,start,end);
        multiplicationOfNumbers(m, x);
    }
    private static void zappMass(int m[], int start, int end){
        for (int i=0; i<m.length; i++){
            m[i] = start+(int)((end-start+1)*Math.random());
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    private static void multiplicationOfNumbers(int m[],int x){
        for (int i=0; i<m.length;i++){
            for (int j = 0; j<m.length; j++){
                if (m[i]*m[j]==x) System.out.print(m[i]+" "+m[j]+" ");
            }
            
        }
    }
}
