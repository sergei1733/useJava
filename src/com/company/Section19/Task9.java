package com.company.Section19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Задание 19.25
Напишите метод, который принимает в качестве параметра массив целых чисел М и
целое число Х и проверяет, встречается ли в массиве пара
расположенных в смежных ячейках чисел, сумма которых равна Х.
 */
public class Task9 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int array[], m[], x, n, start = 10, end = 300;
        n = in.nextInt();
        m = new int[n];
        x = in.nextInt();
        zappMass(m,start,end);
        System.out.println(out(m,x));
    }
    private static void zappMass(int m[], int start, int end){
        for (int i=0; i<m.length;i++){
            m[i] = start+(int)((end-start+1)*Math.random());
            System.out.print(m[i]+" ");
        }
        System.out.println();
    }
    private static boolean out(int m[], int x){
        boolean k = false;
        for (int i=0;i<m.length;i+=2){
            if (m[i]+m[i+1]==x)
                k = true;
        }
        return k;
    }
}
