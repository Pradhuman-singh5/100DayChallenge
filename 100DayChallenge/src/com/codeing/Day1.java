package com.codeing;


import java.util.ArrayList;

public class Day1 {
    public  static int binarySearch(int[] nums,int elt){
        int start=0,end= nums.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==elt){
                return mid;
            }else if(nums[mid]<elt){
                start=mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public  static void selectionSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int minNum = nums[i];
            int minI = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<minNum){
                    minNum = nums[j];
                    minI = j;
                }

            }
            int temp = nums[i];
            nums[i] = minNum;
            nums[minI] = temp;
        }
    }

    public static void insertionSort(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            int j = i-1;
            while (j>=0 && current<nums.get(j)){
                nums.set(j + 1, nums.get(j));
                j--;
            }
            nums.set(j + 1, current);
        }
    }

    public static void quickSort(int[] nums,int low,int high){
        if (low<high){
            int pi = partition(nums,low,high);
            quickSort(nums,low,pi-1);
            quickSort(nums,pi+1,high);
        }
    }

    public static int partition(int[] nums,int low,int high){
        int pivote = nums[high];
        int i = low-1;
        for (int j = low; j <= high-1; j++) {
            if (nums[j]<pivote){
                i++;
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return i+1;
    }


    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static int max(int[] nums){
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[largest]<nums[i]){
                largest = i;
            }
        }
        return largest;
    }
}
