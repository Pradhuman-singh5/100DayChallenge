package com.codeing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day13 {
    public static void coconuts(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A,B;

        int[] input = new int[4];
        for (int i = 0; i < T; i++) {
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();


            A=input[2]/input[0];
            B=input[3]/input[1];
            System.out.println(A+B);
        }
    }

    public static void hiest() throws IOException {

        FastReader in = new FastReader();


        long T = Integer.parseInt(in.next());

        while (T-->0) {
            long D,d,P,Q;
            long x,y,count=0;
            String inp = in.nextLine();
            long arr[] = Arrays.stream(inp.split(" ")).mapToLong(Long::parseLong).toArray();
            D=arr[0];
            d=arr[1];
            P=arr[2];
            Q=arr[3];
            x=D/d;
            if (x%2==0) {
                count+=d*((x/2)*(2*P+(x-1)*Q));
            }else {
                count+=d*(x*(P+((x-1)/2)*Q));
            }
           count+=(D%d)*(P+(x)*Q);
            System.out.println(count);
        }
    }
}
