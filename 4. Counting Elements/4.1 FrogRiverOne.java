//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        int nthSecond=-1,count=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(A[i]<=X && (map.containsKey(A[i]) == false)){
                map.put(A[i],1);
            }
            if (map.size()==X){
                nthSecond=i;
                break;
            }
        }
        //System.out.println(Arrays.toString(jumper));
        //System.out.println(nthSecond);
        return  nthSecond;
    }
}

