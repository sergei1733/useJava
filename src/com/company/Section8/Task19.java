package com.company.Section8;
        /*
Задание 8.19
Четырехзначное число называется «парно-симметричным», если две
его первых цифры и две его последних цифры образуют одинаковые
числа (например - 5252).
Напишите класс, который принимает с клавиатуры четырехзначное
положительное число и определяет, является ли оно «парно-симметричным».
В соответствии с результатом проверки надо вывести на
экран соответствующее текстовое сообщение.
*/

import javax.naming.ServiceUnavailableException;
import java.util.Scanner;


public class Task19 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b,c,a1,a2,a3;
      a = in.nextInt();
      a1 = a/100;
      a2 = a%100;

      if (a1 == a2)
          System.out.println("парно симетричное");
      else
          System.out.println("не симметричное");






    }
}