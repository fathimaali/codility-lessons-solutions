//https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
    Stack<Character> stackoFChar = new Stack<Character>();
    for(int i=0;i<S.length();i++){
        if(S.charAt(i)=='('){
            stackoFChar.push(S.charAt(i));
        }
        else if(!stackoFChar.empty()){
            stackoFChar.pop();
        }
        else{
            return 0;
        }
    }
    if(stackoFChar.size()==0){
        return 1;
    }
    else{
        return 0;
    }
    }
}

