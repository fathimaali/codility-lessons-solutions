//https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        int countOfNumbers=0;
        if(A!=B && A%K==0){
            countOfNumbers=((B/K)-(A/K)+1);    
        }   
        else if(A!=B && A%K!=0){
                countOfNumbers=((B/K)-(A/K));   
        }
        else{
            if(A%K==0){
                countOfNumbers=1;
            }
            else{
                countOfNumbers=0;
            }
        }  
        return countOfNumbers;
    }
}
