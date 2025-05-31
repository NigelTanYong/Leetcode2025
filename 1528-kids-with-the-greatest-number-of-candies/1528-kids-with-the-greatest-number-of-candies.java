//O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        //find max
        for(int i = 0; i< candies.length; i++){
            max = Math.max(candies[i], max);
        }
        //iterate and check 
        for(int i = 0; i< candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}