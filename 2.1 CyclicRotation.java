// you can also use imports, for example:
//import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if (K%A.length==0){
            return A;
        }
        else {
            for (int i=1;i<=K;i++){
                A=rotateArray(A);
            }
            return A;
        }
    }

    public static int[] rotateArray(int[] iA){
        int oA[] = new int[iA.length];
        oA[0]=iA[iA.length-1];
        for (int j=0;j<=iA.length-2;j++){
            oA[j+1]=iA[j];
        }
        return oA;
    }
}
