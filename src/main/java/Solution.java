import java.util.Stack;

public class Solution {

    public Solution(){

    }

    // 1) find the longest common prefix string amongst an array of strings.
    //
    //    If there is no common prefix, return an empty string ""
    public String longestCommonPrefix(String[] str) {

        if (str.length == 0)
            return "";
        String prefix = str[0];
        for (int index = 1; index < str.length; index++){
            while (str[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }


    // 2) Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    public boolean isValid(String s) {
        Stack <Character> stack = new Stack();

        for (int index = 0; index < s.length(); index++){

            char value = s.charAt(index);

            if (value == '[' || value == '{' || value == '(') {
                stack.push(value);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char checkValue = 'o';

            switch (value){
                case ')' :
                    checkValue = stack.pop();
                    if (checkValue == '[' || checkValue == '{')
                        return false;
                    break;
                case '}' :
                    checkValue = stack.pop();
                    if (checkValue == '(' || checkValue == '[')
                        return false;
                    break;
                case ']' :
                    checkValue = stack.pop();
                    if (checkValue == '(' || checkValue == '{')
                        return false;
                    break;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }


    // 3) You are climbing a staircase. It takes n steps to reach the top.
    //
    //    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public int climbStairs(int n) {
        if (n < 3) return n;
        int one = 1;
        int two = 2;
        int fib = 0;
        for (int i = 3; i <= n; i++) {
            fib = one+two;
            one = two;
            two = fib;
        }
        return fib;
    }

}
