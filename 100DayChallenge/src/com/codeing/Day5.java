package com.codeing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Day5 {
    public static void threelargest(int[] num){
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for (int j : num) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else {
                third = j;
            }
        }
        System.out.print(first +" "+second+" " +third);
    }

    public static void rearnge(int[] nums) {
        int neg=0,pos=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0) {
                neg++;
            } else{
                pos++;
            }
        }
        Arrays.sort(nums);
        if (neg<=pos){
            fill1(nums,neg,pos);
        }else {
            reverse(nums);
            fill2(nums,neg,pos);
        }

        }

        static void reverse(int[] nums){
        int t;
            for (int i = 0; i < nums.length/2; i++) {
                t=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=t;
            }
        }

    private static void fill1(int[] nums, int neg, int pos) {
        if (neg%2==0){
            for (int i = 0; i < neg; i = i + 2) {
                int c =nums[i];
                int d = nums[i+neg];
                int temp = c;
                nums[i]=d;
                nums[i+neg]=temp;
            }
        }else {
            for (int i = 0; i <=neg ; i+=2) {
                int c =nums[i];
                int d = nums[i+neg-1];
                int temp = c;
                nums[i]=d;
                nums[i+neg-1]=temp;
            }
        }
    }

    private static void fill2(int[] nums, int neg, int pos) {
        if (pos%2==0){
            for (int i = 0; i < pos; i = i + 2) {
                int c =nums[i];
                int d = nums[i+pos];
                int temp = c;
                nums[i]=d;
                nums[i+pos]=temp;
            }
        }else {
            for (int i = 0; i <=pos ; i+=2) {
                int c =nums[i];
                int d = nums[i+pos-1];
                int temp = c;
                nums[i]=d;
                nums[i+pos-1]=temp;
            }
        }
    }

}
