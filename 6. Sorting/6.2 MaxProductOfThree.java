//https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int product =1;
        product=A[0]*A[1]*A[A.length-1];
        if(lastThreeElements(A)>product){
            product=lastThreeElements(A);
        }
        return product;
    }
    public static int lastThreeElements(int[] A){
        return (A[A.length-1]*A[A.length-2]*A[A.length-3]);
    }
}
