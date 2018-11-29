/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Egor Nikonov
 * @version dated Nov 25, 2018
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class HW3Lesson {
    public static void main(String[] args) {
        Random rand = new Random();
        int a;
        int b;
        do {
            int guess = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Отгадай число от 0 до 9");
            int n = rand.nextInt(10);
            do {
                guess++;
                a = sc.nextInt();
                if (a > n) {
                    System.out.println("Введенное число больше загаданного");

                } else if (a < n) {
                    System.out.println("Введенное число меньше загаданного");

                } else if (a == n) {
                    break;
                }
            } while (guess < 3);
            if (a == n) {
                System.out.println("Вы угадали!");

            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scan = new Scanner(System.in);
            b = scan.nextInt();
        } while (b > 0);

    }
}