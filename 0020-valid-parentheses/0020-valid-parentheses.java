//Hashmap and Stack approach
//Time and Space complexity: O(n)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for(char c:s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }
            else if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop()){ //empty checks when it is the first occurence of c.
                    return false;
                }
            }
        }
        return stack.isEmpty(); //empty means valid parenthesis as no leftover in stack
    }
}