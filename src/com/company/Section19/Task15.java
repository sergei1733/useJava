package com.company.Section19;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
Задание 19.43
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива и возвращает
упорядоченный по возрастанию массив, содержащий значения обоих массивов-параметров, но без повторов значений.
Например, если массивы-параметры содержат 1, 3, 5, 7 и 2, 5, 7, 9, 11, то
выходной массив содержит значения 1, 2, 3, 5, 7, 9, 11.
 */
public class Task15 {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int m[], s[];
        m = new int[]{1, 3, 5, 7, 9};
        s = new int[]{1, 2, 3, 6, 8};
        mass(m, s);
    }

    public static void mass(int m[], int s[]) {
        int ms[], k = 0;
        ms = new int[m.length + s.length];
        for (int i = 0; i < m.length; i++) {
            ms[i] = m[i];
            k++;
        }
        for (int i = 0; i < s.length; i++) {
            ms[k] = s[i];
            k++;
        }
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i] + " ");
        }
        System.out.println();
        sortMass(ms);
    }

    private static void sortMass(int ms[]) {

        boolean sort = false;
        int k;
        while (!sort) {
            sort = true;
            for (int i = 0; i < ms.length-1; i++) {
                if (ms[i] > ms[i+1] ) {
                    k = ms[i];
                    ms[i] = ms[i+1];
                    ms[i+1]=k;
                    sort = false;
                }
            }
        }
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i] + " ");
        }
        System.out.println();
        k=0;
        for (int i = 0; i < ms.length+k; i++) {
          if (ms[i]==ms[i+1]){
              k++;
              ms[i+1]=ms[i+2];
              System.out.print(ms[i]+" ");
          }

        }

       

    }
}
