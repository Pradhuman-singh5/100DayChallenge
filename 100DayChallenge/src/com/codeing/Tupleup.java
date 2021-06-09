package com.codeing;

public class Tupleup {
    static long Modulo = 1000000007;
    public static long power(long base,int n){
        long ans=1;
        while (n>0){
            if(n%2!=0)ans = (ans*base)%Modulo;
            base=(base*base)%Modulo;
            n>>=1;
        }
        return ans;
    }
    public static void bitwiseup(){
        FastReader sc = new FastReader();

        int T = sc.nextInt();;
        while (T-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();
           long  ans = (power(2,N)-1)%Modulo;
            ans=power(ans,M)%Modulo;
            System.out.println(ans);
        }

    }
}
