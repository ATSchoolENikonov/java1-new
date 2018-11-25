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
        invertArray();//метод для задания 1
        fillArray();//метод для задания 2
        changeArray();//метод для задания 3
        maxminArray();//метод для задания 5

    }

    public static void invertArray() {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else arr[i]--;
            System.out.printf(arr[i] + " ");
        }System.out.printf(" \n");
    }

    public static void fillArray() {
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
        for (int j = 0; j < arr2.length; j++) {
            if (j != 0) {
                arr2[j] = arr2[j - 1] + 3;
            }
            System.out.print(arr2[j] + " ");

        }System.out.printf(" \n");

    }public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int d = 0; d < arr3.length; d++) {
            if (arr3[d]<6) {
                arr3[d]=arr3[d]*2;
            }System.out.print(arr3[d]+ " ");
        }System.out.printf(" \n");

    }public static void maxminArray() {
        int [] arr4 = {9,3,7,10,12,8};
        System.out.println(Arrays.toString(arr4));
        int max=arr4[0];
        int min=arr4[0];
        for (int d = 0; d < arr4.length; d++) {

            if (arr4[d]>max){
                max=arr4[d];

            }if (arr4[d]<min) {
                min=arr4[d];
            }
        }System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}
