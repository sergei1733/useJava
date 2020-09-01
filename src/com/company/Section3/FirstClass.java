package com.company.Section3;
        //3.1
        //Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта
        //выражается формулой: C=S(F-32)/9, где С - температура
        //по шкале Цельсия, F - температура по шкале Фаренгейта.
        //Напишите класс, который принимает с клавиатуры температуру по
        //шкале Фаренгейта, а затем выводит на экран эту же температуру, но по
        //шкале Цельсия.
import java.util.Scanner;
public class FirstClass {
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        double tempf,tempC;
        tempf=in.nextDouble();
        tempC=0.5*(tempf-31)/9;
        System.out.println("Температура по шкале Цельсия равна "+tempC);
    }
}