package com.codeing;

import java.util.HashMap;

public class Day4of100 {
    public static int pairsum(int[] arr,int sum){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int j : arr) {
            if (!hm.containsKey(j)) {
                hm.put(j, 0);

                hm.put(j, hm.get(j) + 1);
            }
        }
        int twice_count = 0;

        for (int j : arr) {
            if (hm.get(sum - j) != null) twice_count += hm.get(sum - j);
            if (sum - j == j) twice_count--;
        }

        return twice_count/2;

    }

    public static void findDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=arr.length*2){
                System.out.print(i+" ");
            }
        }
    }
}
