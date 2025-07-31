// Time and space Complexity: O(1)
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //rect length fixed at 4
        //condition that won't overlap:
        ////rec1 completely above,below, left , right
        if(rec1[1]>=rec2[3] || //rec1 above
            rec1[3]<=rec2[1] || //rec1 below
            rec1[2]<=rec2[0] || //rec1 left
            rec1[0]>=rec2[2] //rec1 right
        ) return false;

        return true;
    }
}