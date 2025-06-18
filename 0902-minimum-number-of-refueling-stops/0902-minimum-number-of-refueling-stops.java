//classic greedy approach with maxHeap
//Time Complexity: O(mlogm), Space Complexity:O(n)
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        int miles = startFuel, minStops = 0, i=0;
        
        while (miles < target){
            //seen all stations
            while(i<stations.length && stations[i][0] <= miles){// stations[i][0] = position of the gas station (in miles from the start)
                maxHeap.offer(stations[i][1]); // greedily add all station to heap ;;;stations[i][1] → how much fuel it has (in liters)
                i++;
            }
            if(maxHeap.isEmpty()) return -1; //cannt reach destination
            miles += maxHeap.poll();//add from most to least
            minStops++;
        }

        return minStops;
    }
}