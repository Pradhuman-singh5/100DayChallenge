package com.codeing;

public class paranthesismatching {
    public static void checkbraces(){
        FastReader sc = new FastReader();
        String str = sc.nextLine();
        int maxdepth=0;
        char[] strarray = str.toCharArray();
        int countC=0;
        int countD=0;
        int depth=0;
        for (int i = 0; i < strarray.length; i++) {
            if (countC==0 && strarray[i]==')'){
                System.out.println("Not Matched");
                System.exit(0);
            }
            if(strarray[i]=='(')countC++;
            else if(strarray[i]==')')countD++;
        }
        if(countC!=countD){
            System.out.println("Not Matched");
            System.exit(0);
        }
        for (char i:strarray) {
            if(i=='('){
               depth +=1;
            }else if(i==')'){
                maxdepth = Math.max(maxdepth,depth);
                depth-=1;
            }
        }
        System.out.println(maxdepth);
    }
}
