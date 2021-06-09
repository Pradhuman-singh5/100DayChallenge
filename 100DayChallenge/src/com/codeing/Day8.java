package com.codeing;

import org.w3c.dom.Node;


public class Day8 {
    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
        ListNode root =null;
        ListNode iter =null;
        int carry=0,add=0;
        while (l1!=null || l2!=null){
            if (l1!=null) {
                add=add+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                add=add+l2.val;
                l2=l2.next;
            }
            add+=carry;
            carry=add/10;
            if(root==null){
                root=new ListNode(add%10);
                iter =root;
            }else {
                iter.next=new ListNode(add%10);
                iter =iter.next;
            }
            add=0;
        }
        if (carry!=0) iter.next=new ListNode(carry);

        return root;
    }
   static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord)+getValue(secondWord)==getValue(targetWord);
    }
    private static int getValue(String s){
        int result = 0;
        for(int i =0;i<s.length();i++){
            result = result*10+(s.charAt(i)-'a');
        }
        return result;
    }

    private static String maxValue(String n,int x){
        boolean isNegative = false;
        if(n.charAt(0)=='-') {
            isNegative=true;
            n=n.substring(1);
        }
        for (int i = 0; i < n.length(); i++) {
            int current = n.charAt(i)-'0';
            if(!isNegative && current<x || isNegative && current>x){
                return (isNegative?"-":"")+n.substring(0,i)+x+n.substring(i);
            }
        }
        return (isNegative?"-":"")+n+x;
        }
}
