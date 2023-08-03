//https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(String S) {
        // Use a stack to store the opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string and check if the brackets are properly nested
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            } else {
                // If it's a closing bracket, check if it matches the top element of the stack
                if (stack.isEmpty()) {
                    // If the stack is empty, it means there is no opening bracket to match the closing bracket
                    return 0;
                }
                char top = stack.pop();
                if (c == '}' && top != '{') {
                    return 0;
                }
                if (c == ']' && top != '[') {
                    return 0;
                }
                if (c == ')' && top != '(') {
                    return 0;
                }
            }
        }

        // If the stack is empty at the end, it means all the brackets are properly nested
        return stack.isEmpty() ? 1 : 0;
    }
}

