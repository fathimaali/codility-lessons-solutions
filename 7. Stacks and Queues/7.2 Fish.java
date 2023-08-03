//https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/

// you can also use imports, for example:
import java.util.*;
import java.lang.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        int numberOfFishesAlive=A.length;
        Stack<Integer> stackOfFish = new Stack<Integer>();
        for(int i=0;i<A.length;i++){
            if(B[i]==1){
                stackOfFish.push(A[i]);
            }
            else {
                while( !stackOfFish.isEmpty() ){ 
                    if( stackOfFish.peek() > A[i] ){
                        numberOfFishesAlive--;
                        break;     
                    }
                    
                    else if(stackOfFish.peek() < A[i]){
                        numberOfFishesAlive--;
                        stackOfFish.pop(); 
                    }
                }
            }
        }      
        return numberOfFishesAlive;
     }
}
