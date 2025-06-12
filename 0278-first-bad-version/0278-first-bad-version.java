/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//binary search
// Time complexity: O(logn), space complexity: O(1)
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        while (low<=n){
            int m=low+(n-low)/2;
            if(isBadVersion(m))
                n = m - 1;
            else
                low = m+1;
        }
        return low;
    }
}


/*
classic binary search, you:

Keep narrowing the search space by half

Use mid = low + (high - low) / 2 to find the middle

Decide whether to search the left or right half next
*/