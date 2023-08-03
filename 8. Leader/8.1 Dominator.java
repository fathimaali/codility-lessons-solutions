//https://app.codility.com/programmers/lessons/8-leader/dominator/


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int indexOfDominator=-1,candidate=0,count=0;
        Stack<Integer> stackOfNum = new Stack<Integer>();
        for(int i=0;i<A.length;i++){
            if(!stackOfNum.empty() && stackOfNum.peek()!=A[i]){
                stackOfNum.push(A[i]);
                stackOfNum.pop();
                stackOfNum.pop();
            }
            else if(!stackOfNum.empty() && stackOfNum.peek()==A[i]){
                stackOfNum.push(A[i]);
            }
            else{
                stackOfNum.push(A[i]);
            }
        }
        if(stackOfNum.size()==0){
            indexOfDominator=-1;
        }
        else{
            candidate=stackOfNum.peek();
        }
        for(int i=0;i<A.length;i++){
            if(A[i]==candidate){
                count++;
            }
            if(count>(A.length/2)){
                indexOfDominator=i;
                break;
            }
        }
        return indexOfDominator;
}
}
