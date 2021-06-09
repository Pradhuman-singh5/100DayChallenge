package com.codeing;


import java.util.HashMap;

public class Day7{

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> HT= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reamin = (Integer)(target-nums[i]);
            if (HT.containsKey(reamin)){
                int[] res = {HT.get(reamin),i};
                return res;
            }
            HT.put(nums[i],i);
        }
        return null;
    }

    public static int longestSubstring(String s){
        HashMap<Character,Integer> HT = new HashMap<>();
        int right=0;
        int left=0;
        int len=0;
        int n = s.length();
        while (right<n){
            if(HT.containsKey(s.charAt(right))){
                left = Math.max(HT.get(s.charAt(right))+1,left);
            }
            HT.put(s.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}
