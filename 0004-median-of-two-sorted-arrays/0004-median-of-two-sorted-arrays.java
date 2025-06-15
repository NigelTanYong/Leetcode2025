//2 pointer approach
//Time Complexity: O(n+m), Space Complexity: O(1)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int i = 0, j= 0;
        int m1 = 0, m2 =0; //track the last two numbers seen while traversing

        //find median- iterate until reach the middle of the merged array
        for(int count = 0; count <= (num1Len+num2Len)/2; count++){
            m2 = m1; //m2 keeps previous value
            // If both arrays have elements left to compare
            if(i!=num1Len && j!= num2Len){ // take the smaller by simulating mergesort
                if(nums1[i]>nums2[j]){
                    m1 = nums2[j];
                    j++;
                }
                else{ //num1[i]<=num2[i]
                    m1 = nums1[i];
                    i++;
                }
            }
            else if(i<num1Len){ // If nums1 still has elements left
                m1 = nums1[i];
                i++;
            } else{ //i >= nums1Len -- If nums2 still has elements left
                m1 = nums2[j];
                j++;
            }
        }
        if((num1Len+num2Len)%2 ==1){//odd
            return (double) m1;
        } else{
            double ans = (double) m1 + (double) m2;
            return ans/2.0;
        }
    }
}