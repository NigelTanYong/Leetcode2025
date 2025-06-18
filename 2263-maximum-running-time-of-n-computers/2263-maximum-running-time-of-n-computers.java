//greedy approach
//Time complexity: O(mlog(m)), Space complexity: O(1)
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        //sort from small to large
        Arrays.sort(batteries);
        long sum = 0;

        for(int minute : batteries){ //to get total minute available form batteries
            sum+=minute;
        }

        int i = 0, numOfBatteries = batteries.length;
        // loop greedily removes the largest batteries that are too large
        while(batteries[(numOfBatteries - 1) - i] > sum/(n - i)){ // suppose giving each of remaining computer equal time (sum/numOfBatteries - i)
            /*If a battery is larger than this fair share,
            then it’s too big to include in the fair division (since it would force others to have less).
            So we remove that battery and treat it as a dedicated battery, not part of the shared pool*/
            sum -= batteries[(numOfBatteries - 1) - i];
            i++;
        }
        //After removing overpowered batteries, 
        //divide remaining total power equally among the remaining n - k computers
        return sum/(n-i);

    }
}