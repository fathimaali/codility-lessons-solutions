// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static int solution(int N) {
        if (N>1){
            int2binary(N);
            int i = binaryString.length();
            counter = 0;
            result = 0;
            for (int j=1;j<i;j++){
                if (binaryString.charAt(j)=='0'){
                counter = counter + 1;
            }
                else if(binaryString.charAt(j)=='1'){
                    if(counter>result){
                        result = counter;
                    }
                    counter = 0;
                }
            }
        }
        else{
            result = 0;
        }
        return result;
    }

    public static String binaryString; 
    public static int result; 
    public static int counter;

    public static String int2binary(int n) {
        binaryString = Integer.toBinaryString(n);
        return binaryString;
    }
}

