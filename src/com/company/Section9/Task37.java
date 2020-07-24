package com.company.Section9;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/*
Задание 9.37
Напишите класс, который принимает с клавиатуры имя и фамилию
одного человека, а затем имя и фамилию другого.
Класс должен проверить, являются ли эти два человека:
• тезками, но не однофамильцами;
• однофамильцами, но не тезками;
• и тезками, и однофамильцами.
По результатам проверки следует вывести на экран соответствующее
сообщение.
 */
public class Task37 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    String name1,name2,fam1,fam2;
    name1 = in.next();
    fam1 = in.next();
    name2 = in.next();
    fam2 = in.next();
        System.out.println(name1.equals(name2)&&fam1.equals(fam2)?"тезка и однофамилец":"");
        System.out.println(name1.equals(name2)&& fam1.equals(fam2)==false?"тезки и не однофамильцы":"");
    }
}
