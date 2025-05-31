class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: answer[i] = product of all elements to the left of i
        answer[0] = 1;  // Nothing to the left of index 0
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: multiply with product of elements to the right of i
        int rightProduct = 1;  // Nothing to the right of last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
        
    }
}