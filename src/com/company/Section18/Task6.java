package com.company.Section18;

import java.util.Scanner;

/*
Задание 18.17
Напишите класс, который заполняет случайными трехзначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом: в каждой строке выводится значения из двух ячеек, симметрично расположенных по отношению к середине массива.
В случае если массив имеет нечетный размер, центральную ячейку
следует выводить в отдельной строке.
Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом:
345 и 985
455и175
677
 */
public class Task6 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int srray[], start = 100, end = 999, x;
        x = in.nextInt();
        srray = new int[x];
        zapMass(srray,start,end);
        out(srray,x);
    }
    private static void zapMass(int array[], int start, int end){
        for (int i=0; i<array.length; i++){
            array[i] = start + (int)((end-start+1)*Math.random());
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    private static void out(int array[], int x){
        int k=0;
        for (int i=0;i<array.length/2;i++) {
            if (array.length % 2 != 0)
                k=1;
                x -= 1;
                System.out.println(array[i] + " " + array[x]);
        }
        if (k==1)
            System.out.println(array[array.length/2]);

    }
}
