//https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int pairCount=0, countOfOne=0;
        for(int k=0;k<A.length;k++){
            if(A[k]==1){
                countOfOne++;
            }
        }
        for(int i=0;i<A.length;i++){
            if (pairCount<=1000000000){
                if(A[i]==0){
                    pairCount=pairCount+countOfOne;
                }
                else{
                    countOfOne--;
                }
            } else{
                pairCount=-1;
                break;
            }            
        }
        return pairCount;
    }
}

