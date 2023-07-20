// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int unPairedNumber=A[0];
        for(int i=1;i<A.length;i++){
            unPairedNumber = unPairedNumber ^ A[i];
        }
    return unPairedNumber;
    }
}
