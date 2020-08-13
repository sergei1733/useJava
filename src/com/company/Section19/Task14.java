package com.company.Section19;

import java.util.Scanner;

/*
Задание 19.42
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива и возвращает упорядоченный по
возрастанию массив, содержащий все значения обоих массивовпараметров.
 */
public class Task14 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m1[], m2[], x;
        m1 = new int[]{1, 10, 20, 30, 40, 50, 60};
        m2 = new int[]{2, 15, 25, 35, 45, 55, 65};
        mass(m1, m2);
    }

    private static void mass(int m1[], int m2[]) {
        int m3[], j = 0, perem;
        m3 = new int[m1.length + m2.length];
        for (int i = 0; i < m1.length; i++) {
            m3[i] = m1[i];
        }
        for (int i = m1.length; i < m3.length; i++) {
            m3[i] = m2[j];
            j++;
        }
        for (int i = 0; i < m3.length; i++) {
            System.out.print(m3[i] + " ");
        }
        boolean sort = false;
        while (sort!=true) {
            sort = true;
            for (int i = 0; i < m3.length - 1; i++) {
                if (m3[i] > m3[i + 1]) {
                    perem = m3[i];
                    m3[i] = m3[i + 1];
                    m3[i + 1] = perem;
                    sort = false;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m3.length; i++) {
            System.out.print(m3[i] + " ");
        }
    }
}
