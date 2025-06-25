// Time Complexity: O(n log n + m log m)), Space Complexity: O(1)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        int i = 0, j = 0, k = 0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while (i < nums1Len && j < nums2Len){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                nums1[k] = nums1[i];
                k++;
                j++;
                i++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
        
    }
}