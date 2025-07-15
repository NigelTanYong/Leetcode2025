// Time Complexity: O(n), Space Complexity: O(1)
class Solution {
    public boolean judgeCircle(String moves) {
        int verticalDeviation = 0, horizontalDeviation = 0;

        for(char c : moves.toCharArray()){
            if(c == 'R'){
                horizontalDeviation++;
            }
            else if(c == 'L'){
                horizontalDeviation--;
            }
            else if(c == 'U'){
                verticalDeviation++;
            }
            else{
                verticalDeviation--;
            }
        }
        return (verticalDeviation == 0 && horizontalDeviation == 0) ? true : false;
    }
}