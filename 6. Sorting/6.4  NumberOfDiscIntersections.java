//https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int  countOfPairsOfDiscs=0;
        long lli=0,uli=0, llj=0,ulj=0;
        if(countOfPairsOfDiscs<10000000){
            for(int i=0;i<A.length;i++){
                lli=i-Long.valueOf(A[i]);
                uli=i+Long.valueOf(A[i]);
                for(int j=i+1;j<A.length;j++){
                    llj=j-Long.valueOf(A[j]);
                    ulj=j+Long.valueOf(A[j]);
                    if(uli>=llj || lli>=ulj){
                        countOfPairsOfDiscs++;
                    }
                }
            }
        }
        else{
            countOfPairsOfDiscs=-1;
        }
        return countOfPairsOfDiscs;
    }
}
