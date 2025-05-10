class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long nums1Sum = 0, nums2Sum = 0;
        long zero1 = 0, zero2 = 0;
        for (int num:nums1){
            nums1Sum += num;
            if(num==0){
                nums1Sum++;
                zero1++;
            }
        }
        for(int num: nums2){
            nums2Sum += num;
            if(num==0){
                nums2Sum++;
                zero2++;
            }
        }
        if((zero1 == 0 && nums2Sum>nums1Sum) || (zero2 == 0 && nums1Sum > nums2Sum)){
            return -1;
        }
        return Math.max(nums1Sum, nums2Sum);

        
    }
}