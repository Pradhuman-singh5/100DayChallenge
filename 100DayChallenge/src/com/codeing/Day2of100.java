package com.codeing;

public class Day2of100 {
    public static void naiveRearangment(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i) arr[i] = -1;
        }
    }

    public static void rearngment2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=-1 && arr[i]!=i){
                int x = arr[i];

                while (arr[x]!=-1 && arr[x]!=x){
                    int y=arr[x];
                    arr[x]=x;
                    x=y;
                }
               arr[x]=x;

                if(arr[i]!=i){
                    arr[i]=-1;
                }
            }
        }
    }
}
