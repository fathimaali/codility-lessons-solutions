//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
    int minimumJumps = 0;
    if((Y-X)%D == 0) {
        minimumJumps=(Y-X)/D;
    } else{
        minimumJumps=((Y-X)/D)+1;
    }    
    return minimumJumps;
    }
}
