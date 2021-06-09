package com.codeing;

public class Day10 {



            public int[] decompressRLElist(int[] nums) {

                int freqArrSize=0;
                for(int i=0;i<nums.length;i=i+2){
                    freqArrSize+=nums[i];
                }
                int freqArr[]=new int[freqArrSize];
                int k=0;

                for(int i=0;i<nums.length;i=i+2){
                    for(int j=0;j<nums[i];j++){
                        freqArr[k]=nums[i+1];
                        k++;
                    }
                }
                return freqArr;
            }

    public static void sort012(int a[], int n)
    {
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
    }


