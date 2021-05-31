package com.codeing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Day9 {
    public static boolean canBeEqual(int[] arr,int[] target){
        Arrays.sort(target);
        Arrays.sort(arr);
        if(Arrays.equals(target, arr)){
            return true;
        }
        return false;
    }

    public static int[] runningsum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i-1>=0)
                arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static int[] shuffle(int[] nums,int n) {
        int[] res = new int[nums.length];
        if(n<0) {
            return nums;
        }
        int j=0;
        for (int i = 0; i < n; i++) {
            res[j]=nums[i];
            res[j+1]=nums[n+i];
            j+=2;
        }
        return res;
    }


}
