//use max-heap
//time complexity: O(nlogn)
//space complexity: O(n)
class Solution {
    public int lastStoneWeight(int[] stones) {
        //switch default min heap in priority queue to max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int stone : stones) { //populate the pq and pq will prioritise largest value first
            pq.offer(stone);
        }
        while (pq.size() > 1){ //at most one stone left
            pq.offer(pq.poll() - pq.poll());
        } 
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}