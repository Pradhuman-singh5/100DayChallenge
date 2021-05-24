package com.codeing;

import java.util.ArrayList;

public class Day1of100 {
    public static void rotatM1(int[] arr,int d){
        int[] temp = new int[d];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(i+d<arr.length){
                arr[i]=arr[i+d];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[arr.length-1-i]=temp[i];
        }
    }

    public static void rotatM2(int[] arr,int d){
        for (int i = 0; i < d; i++) {
            leftrotatebyone(arr);
        }
    }

    private static void leftrotatebyone(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i <arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void reverseRotate(int[] arr,int d){

            reverse(arr,0,d-1);
            reverse(arr,d,arr.length-1);
            reverse(arr,0,arr.length-1);

    }

    private static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
