//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int smallestPosNumber=1000001,max=0;
        String eoa="";
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>();
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]>0 && record.containsKey(A[i])==false){
                record.put(A[i],1);
            }
        }
        max = Arrays.stream(A).max().getAsInt();
        for (int j=1;j<=max;j++){
            if(record.containsKey(j)==false){
                smallestPosNumber=j;
                break;
            }
            eoa="Y";
        }
        if(eoa=="Y" && smallestPosNumber==1000001){
            smallestPosNumber=max+1;
        }
        if(smallestPosNumber==1000001){
            smallestPosNumber=1;
        }
        return smallestPosNumber;
    }
}
