class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();

        int length = s.length();
        
        for(int i =0; i<length; i++){
            char c = s.charAt(i);
            if(st.size()>0 && st.peek() == c){
                count.push(count.peek()+1);
            }
            else count.push(1);
            st.push(c);
            
            if(count.peek() == k){ //removal
                for(int j=0; j<k; j++){
                    st.pop();
                    count.pop();
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}