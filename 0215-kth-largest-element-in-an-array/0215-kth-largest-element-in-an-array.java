//min heap
//Time complexity: O(nlogk), Space complexity: O(k)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll(); //fifo
            }
        }
        return pq.poll();
    }
}