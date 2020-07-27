package com.company.Section10;
import java.lang.Math;
/*
Задание 10.13
Два человека играют в кости по следующим правилам: в каждом раунде игры (а она состоит из 10 раундов) каждый из участников бросает
«кость» (кубик, на гранях которого значения от 1 до 6). В каждом раунде определяется победитель или фиксируется состояние «ничья», в зависимости от значения, которое выпало на кубике участника.
Напишите класс, который моделирует эту игру, указывая для каждого
раунда, кто из игроков набрал в этом раунде больше очков - или сообщая О СОСТОЯНИИ «НИЧЬЯ».
 */
public class Task13 {
    public static void main(String[] args) {
        int start=1,end=6,a,a1;
        for (int i=1; i<11; i++){
            a = start + (int)((end-start+1)*Math.random());
            a1 = start + (int)((end-start+1)*Math.random());
            if (a>a1) System.out.println("первый игрок выйграл и набрал "+a+" баллов");
            if (a1>a) System.out.println("второй игрок выйграл и набрал "+a1+" баллов");
            if (a1==a) System.out.println("ничья");
        }

    }
}