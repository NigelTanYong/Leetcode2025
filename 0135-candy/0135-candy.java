//two-pass greedy algorithm
//time and space complexity: O(n)
class Solution {
    public int candy(int[] ratings) {
        int numOfChild = ratings.length;
        int[] candies = new int[numOfChild];
        int count = 0;
        //each child should have at least 1 candy
        for(int i = 0; i<numOfChild; i++) candies[i] = 1; //[1,1,..,1]
        //forward pass - greedily add 1 candy
        for(int i = 1; i<numOfChild; i++){
            if(ratings[i] > ratings[i-1]){ //left neighbour rule
                candies[i] = candies[i-1] + 1; //since rating of current child higher, it must be more than previous child
            }
        }
        //backward pass - greedy ensure max
        for(int i = numOfChild - 1; i > 0; i--){
            if(ratings[i-1] > ratings[i]){ //right neighbour rule
                candies[i - 1] = Math.max(candies[i] + 1, candies[i-1]);
            }
            count += candies[i-1];//
        }
        return count + candies[numOfChild-1]; //adds the last child as the count in the loop only counts i -1
    }
}