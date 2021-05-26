package com.codeing;

import java.util.ArrayList;

public class Day3of100 {
    public static void revers(String name) {
        char[] array = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            array[i] = name.charAt(i);
        }
        int start = 0, end = array.length - 1;
        char temp;
        for (int i = 0; i < array.length; i++) {
            if (start < end) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void maxmin(int[] arr){
        int max=arr[0],min=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min) min =arr[i];
            if(arr[i]>max) max =arr[i];
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }

    public static Integer kthmax(ArrayList<Integer> num,int k){
        insertionSort(num);

        return num.get(num.size()-k);

    }

    public static void insertionSort(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            Integer current = nums.get(i);
            Integer j = i-1;
            while (j>=0 && current<nums.get(j)){
                nums.set(j + 1, nums.get(j));
                j--;
            }
            nums.set(j + 1, current);
        }
    }

    public static int isoccur(ArrayList<Integer> num,Integer n){
       int count=0;
        for (int i = 0; i < num.size(); i++) {
            if(num.get(i)==n) count +=1;
        }
        return count;
    }


}
