//in-place merge algo, time complexity==o(m+n) space complexity == O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1; //point to last index
        int k = m+n-1; ///points to last index of combined array

        while(j>=0){ //to merge till elements from num2 are placed in num1  
            if(i>=0 && (nums1[i] > nums2[j])){
                nums1[k] = nums1[i];
                i--;
            }else{ //i<0 || (nums1[i] <= nums2[j])
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}