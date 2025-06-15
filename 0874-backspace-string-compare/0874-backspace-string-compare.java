// Stack Approach
// Time and Space Complexity: O(n+m)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sResult = new Stack<>();
        Stack<Character> tResult = new Stack<>();

        for(char c : s.toCharArray()){
            if(c!='#')
                sResult.push(c);// type the character
            else if (!sResult.empty()){
                sResult.pop(); // backspace (remove previous char)
            }
        }

        for(char c : t.toCharArray()){
            if(c!='#')
                tResult.push(c);
            else if (!tResult.empty()){
                tResult.pop();
            }
        }

        return sResult.equals(tResult); //compares the stack
      
    }
}