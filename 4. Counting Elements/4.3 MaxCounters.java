//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        int[] finalCounterState = new int[N];
        int max1=0,max2=0;;
        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
                   finalCounterState= new int[N];
                    max2=max2+max1;
                    max1=0;
                }
            else{
                finalCounterState[A[i]-1]++;
                if(finalCounterState[A[i]-1]>max1){
                    max1=finalCounterState[A[i]-1];
                }
            }
        }
        //System.out.println(Arrays.toString(finalCounterState));
        for (int i=0;i<finalCounterState.length;i++){
                finalCounterState[i]=finalCounterState[i]+max2;
        }
        //System.out.println(Arrays.toString(finalCounterState));
        return finalCounterState;
    }
}

