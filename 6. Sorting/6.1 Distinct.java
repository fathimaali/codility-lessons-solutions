//https://app.codility.com/programmers/lessons/6-sorting/distinct/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int countOfDistinct=0;
        HashMap<Integer, Integer> hashmapElements = new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++){
            if(hashmapElements.containsKey(A[i])==false){
                hashmapElements.put(A[i],1);
            }
        }
        countOfDistinct=hashmapElements.size();
        return countOfDistinct;
    }
}

