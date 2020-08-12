package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.15
Напишите метод, который получает в качестве параметра массив и дополнительный параметр S.
Метод сначала заполняет четные ячейки массива двузначными положительными случайными числами.
Затем нечетные ячейки метод заполняет так, чтобы сумма значений в нечетной ячейке и в
предшествующей ей четной ячейке была равна S. Каким условиям
должен отвечать параметр S для того, чтобы задача имела решение?
 */
public class Task4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,array[],s, start=10, end=99;
        x = in.nextInt();
        s = in.nextInt();
        array = new int[x];
        zapMass(array,start,end);
        zapMassNotEven(array,start,end,s);
    }
    private static void zapMass(int array[],int start, int end){
        for (int i=0; i<array.length;i++){
            if ((i+1)%2==0)
                array[i]=start+(int)((end-start+1)*Math.random());
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    private static void zapMassNotEven(int array[],int start, int end, int s){
        for (int i=0; i<array.length;i++){
            if ((i+1)%2!=0)
                array[i]=s-array[i+1];
            System.out.print(array[i]+" ");
        }
    }

}
