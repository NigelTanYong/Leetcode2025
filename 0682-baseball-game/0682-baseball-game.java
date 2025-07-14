// Time and Space complexity: O(n)
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int firstNum = st.peek();
                int temp = st.pop();
                int secondNum = st.peek();
                st.push(temp);
                st.push(firstNum+secondNum);
            }
            else if(operations[i].equals("D")){
                 int num = st.peek();
                st.push(num*2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}