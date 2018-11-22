package com.company;

public class java1task2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = -5;
        b = 10;
        c = 7;
        d = 5;
        String f="Хацкер";
        System.out.println("a*(b+(c/d))");//вывод метода для задания 3
        System.out.println("a+b="+ istina(a,b));//вывод метода для задания 4
        System.out.println("a is " + Otricalovo(a) );// 6 задание
        System.out.println("hello " + f);
        if (a >= 0) {                                   //5 задание
            System.out.println("Ur karma is positive");
        }
        else {System.out.println("Ur karma sux");
        }
    }
    public static int megacalculate ( int a, int b, int c, int d){
        return a * (b + (c / d));
    }public static boolean istina(int f,int g) {
        if (10 <= f + g && f + g <= 20) {
            return true;
        }
        else return false;

    }public static boolean Otricalovo(int a){
        if (a<0){
            return true;
        }else return false;
    }
}