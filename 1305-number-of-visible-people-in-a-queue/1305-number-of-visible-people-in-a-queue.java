// traverse right with stack O(n)
class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] answer=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            int count=0;
            while(!st.isEmpty() && st.peek()<heights[i]){
                st.pop();
                count++;
            }
            if(!st.isEmpty()){ //after all shorter are popped, there might be taller people
                count++;
            }
            answer[i] = count;
            st.push(heights[i]);
        }
        return answer;
    }
}