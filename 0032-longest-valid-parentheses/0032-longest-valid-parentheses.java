//Time and space Complexity: O(n)
class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        if(s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // for else case pop when stack is empty
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{ // .charAt(i) != '('
                stack.pop();
                if(stack.isEmpty()){ // case when it is the start
                    stack.push(i);
                }else{
                    maxLen = Math.max(maxLen, i-stack.peek()); //either itself or current index - previous '(' index 
                }
            }
        }
        return maxLen;
    }
}