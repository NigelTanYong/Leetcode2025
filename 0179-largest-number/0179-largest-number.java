class Solution {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> maxHeap = new PriorityQueue<>((a,b)-> (b+a).compareTo(a+b)); //compare by char

        int totalLength = 0;

        //convert integer to strings and offer into maxHeap
        for(int num:nums){
            maxHeap.offer(String.valueOf(num));
            totalLength += String.valueOf(num).length();
        }

        //build result string
        StringBuilder result = new StringBuilder(totalLength);
        while(!maxHeap.isEmpty()){
            result.append(maxHeap.poll()); //return and remove from priority queue
        }
        //handle cases like ["0","0"]--- we don't want 00 but 0
        if(result.charAt(0) == '0') return "0";
        return result.toString();
    }
}