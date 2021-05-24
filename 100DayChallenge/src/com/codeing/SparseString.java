package com.codeing;

import java.util.ArrayList;
import java.util.List;

public class SparseString {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        int counter =0;
        List<Integer> q= new ArrayList<Integer>();
        for(int i = 0;i<queries.size();i++){
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equals(strings.get(j))){
                    counter= counter+1;
                }
                q.add(counter);
            }
            counter=0;
        }

        return q;
    }
}

