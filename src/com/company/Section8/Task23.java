package com.company.Section8;
        /*
Задание 8.2 3
Напишите класс, который принимает с клавиатуры два целых числа и
изменяет их следующим образом:
• при разных значениях, большее число уменьшается на 1, а меньшее - увеличивается на 1;
• при одинаковых значениях чисел оба увеличиваются на 1.
Программа должна вывести на экран новые значения переменных.

*/

import java.util.Scanner;


public class Task23 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      b = in.nextInt();

      if (a != b && a > b)
          {System.out.println(a-1);
          System.out.println(b+1);}
      else if (a != b && a < b)
          {System.out.println(b - 1);
          System.out.println(a + 1);}
      else
          {System.out.println(a + 1);
          System.out.println(b + 1);}

    }
}