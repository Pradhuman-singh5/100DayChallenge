package com.codeing;

import java.lang.constant.Constable;
import java.util.Hashtable;

public class Day6 {
    public static Character firstnonrepeat(String string){
        Hashtable<Character,Integer> HT = new Hashtable<>();
        for (int i = 0; i < string.length(); i++) {
            if(!HT.containsKey(string.charAt(i))){
                System.out.println(HT);
            }else {
                HT.put(string.charAt(i),HT.get(string.charAt(i))+1);
            }
        }

        for (int i = 0; i < string.length(); i++) {
            if(HT.get(string.charAt(i))==1){
                return string.charAt(i);
            }
        }
        System.out.println(HT);
        return null;
    }

    public static int findmin(int[] num,int low,int high){
        if(low>high) return num[0];

        if(low==high) return num[low];

        int mid =(low+high)/2;

        if(mid<high && num[mid+1]<num[mid]) return num[mid];

        if (mid>low && num[mid-1]>num[mid]) return num[mid];

        if(num[high]>num[mid]) return findmin(num,low,mid-1);

        return findmin(num,mid+1,high);
    }

    public static int maxwater(int[] arr){
        int res=0;
        for (int i = 1; i < arr.length-1; i++) {
            int left=arr[i];
            for(int j = 0;j<i;j++){
                left=Math.max(arr[j],left);
            }

            int right = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                right=Math.max(right,arr[j]);
            }

            res +=Math.min(right,left)-arr[i];
        }
        return res;
    }
}
