package leetCode;

import java.util.Stack;

public class ValidParantheses {

    public static boolean solutions(String str){
        Stack<Character> stack = new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            else if(c=='}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(c==']' && !stack.empty() && stack.peek()=='['){
                stack.pop();
            }
            else if(c==')' && !stack.empty() && stack.peek()=='('){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        System.out.println(solutions(s1)); // true
        System.out.println(solutions(s2)); // true
        System.out.println(solutions(s3)); // false
        System.out.println(solutions(s4)); // false
        System.out.println(solutions(s5)); // true
    }
}
