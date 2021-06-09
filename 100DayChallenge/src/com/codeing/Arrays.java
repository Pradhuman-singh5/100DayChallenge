package com.codeing;

public class Arrays {

    public static void rearrangnegve(int[] arr){
        int j=0,temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                if(i!=j){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                j++;
            }
        }
    }
    public static void unionArray(int[] arr1,int[] arr2){
        int i=0,j=0;
        int m=arr1.length;
        int n=arr2.length;
        while (i<m && j<n){
            if(arr1[i]<arr2[j]) {
                System.out.print(arr1[i]);
                i++;
            }else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j]);
                j++;
            } else if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < m)
            System.out.print(arr1[i++]);
        while (j < n)
            System.out.print(arr2[j++]);
    }
    int[][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        visited = new int[m][n];
        int maxArea =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    int area =0;
                    maxArea =Math.max(dfs(grid,i,j,area),maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int i,int j,int area){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n) return area;
        if(visited[i][j]==1 || grid[i][j]==0) return area;

        visited[i][j]=1;
        area++;
        int[] iter ={-1,1,0,0};
        int[] jter ={0,0,-1,1};

        for(int k=0;k<iter.length;k++){
            area=  dfs(grid,i+iter[k],j+jter[k],area);
        }
        return area;
    }
    public String restoreString(String s, int[] indices) {
        char[] temp_s=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            temp_s[indices[i]]=s.charAt(i);
        }
        StringBuffer sb = new StringBuffer();
        for(char a: temp_s)
            sb.append(a);
        return  sb.toString();
    }
}

