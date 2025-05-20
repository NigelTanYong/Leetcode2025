int minSubArrayLen(int target, int* nums, int numsSize) {
    int left = 0;
    int curSum = 0;
    int minLen = INT_MAX;

    for (int right = 0; right < numsSize; right++){
        curSum += nums[right];
        while(curSum>=target){
            if(minLen < right-left+1){
                minLen = minLen;
            }
            else{
                minLen = right-left+1;
            }
            curSum-=nums[left];
            left++;
        }
    }
    return minLen == INT_MAX ? 0 : minLen;
}