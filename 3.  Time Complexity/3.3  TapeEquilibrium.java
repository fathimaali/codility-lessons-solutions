//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    
    public int solution(int[] A) {
        int leftSum,rightSum,minimumDiff=0;
        leftSum=(sumOfRange(A,0,0));
        rightSum=(sumOfRange(A,1,A.length-1));
        minimumDiff=Math.abs(leftSum-rightSum);
        if(Math.abs(leftSum-rightSum)<minimumDiff){
                minimumDiff=Math.abs(Math.abs(leftSum-rightSum));
            }
        for(int j=1;j<A.length-1;j++){
            leftSum=leftSum+A[j];
            rightSum=rightSum-A[j];
            if(Math.abs(leftSum-rightSum)<minimumDiff){
                minimumDiff=Math.abs(Math.abs(leftSum-rightSum));
            }

        }
        return minimumDiff; 
    }
    public static int sumOfRange(int[] A, int start, int end){
        int sumOfRange=0;
        for(int i=start;i<=end;i++){
            sumOfRange=sumOfRange+A[i];
        }
        return sumOfRange;
    }
}