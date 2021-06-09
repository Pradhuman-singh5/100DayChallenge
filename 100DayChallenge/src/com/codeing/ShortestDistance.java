package com.codeing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ShortestDistance {
    public static void ShortestRout() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int T = Integer.parseInt(br.readLine());
        StringBuilder res=new StringBuilder();
        while (T-->0){
            int max= Integer.MAX_VALUE;
            int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n=in[0];
            int m=in[1];
            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Map<Integer,Integer> mp=new HashMap<>() ;
            for (int i = 0; i < n; i++) {
                if(i==0) mp.put(i,0);
                else if (A[i]!=0)mp.put(i,0);
                else mp.put(i,max);
            }
            int right = -1;
            for (int i = 0; i < n; i++) {
                if(A[i]==1)right=i;
                if(right!=-1){
                    if (A[i]==0)mp.put(i,Math.min(mp.get(i),i-right));
                }
            }
            int left = -1;
            for (int i = n; i < 0; i--) {
                if (A[i]==2)left=i;
                if(left!=-1){
                    if(A[i]==0)mp.put(i,Math.min(mp.get(i),left-1));
                }
            }
            for (int i = 0; i < m; i++) {
                int j =B[i]-1;
                if (mp.get(j)!=max) res.append(mp.get(j)+" ");
                else res.append("-1 ");
            }
            res.append("\n");
        }
        ps.print(res);
    }
}
