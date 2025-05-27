//Traverse from right, O(n) because of skips (memoization- reusing calculated values)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;

            while (j < n && temperatures[j] <= temperatures[i]) {
                if (answer[j] > 0) {
                    j += answer[j]; // skip ahead to next known warmer day when there is answer on answer[i]
                } else {
                    j = n; // no warmer days ahead
                }
            }

            if (j < n) {
                answer[i] = j - i;
            }
        }

        return answer;
    }
    
}