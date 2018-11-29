/**
 * Java. Level 1. Lesson 2. Example of homework
 *
 * @author Egor Nikonov
 * @version dated Nov 25, 2018
 */
package com.company;

import java.util.Arrays;


public class HW2Lesson {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 1};//метод для задания 1
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
                System.out.print( (arr[i] == 0 ? arr[i]+1 : arr[i]-1)+" ");
        }System.out.printf(" \n");

        int[] arr2 = new int[8];//метод для задания 2
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (i != 0) {
                arr2[i] = arr2[i - 1] + 3;
            }
            System.out.print(arr2[i] + " ");

        }
        System.out.printf(" \n");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//метод для задания 3
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.printf(" \n");
        int[] arr4 = {9, 3, 7, 10, 12, 8};//метод для задания 4.1
        System.out.println(Arrays.toString(arr4));
        int max = arr4[0];

        for (int i = 0; i < arr4.length; i++) {

            if (arr4[i] > max) {
                max = arr4[i];

            }
        }
        System.out.println("max is " + max);

        int min = arr4[0];//метод для задания 4.2
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
            }
        }
        System.out.println("min is " + min);
    }
}