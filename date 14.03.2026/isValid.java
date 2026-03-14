import java.util.*;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(c == '{') {
                stack.push('}');
            }
            else if(c == '(') {
                stack.push(')');
            }
            else if(c == '[') {
                stack.push(']');
            }
            else {
                if(stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the parentheses string: ");
        String input = sc.nextLine();

        Solution obj = new Solution();

        boolean result = obj.isValid(input);

        if(result) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}