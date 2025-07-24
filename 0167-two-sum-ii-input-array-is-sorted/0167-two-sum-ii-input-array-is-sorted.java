//two pointer approach
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //init two points p1 and p2 = numbers length - 1
        //while loop condition: p1<p2
        ////init diff variable to store difference num[p1]+num[p2] -target 
        ////if difference == 0 then get the index and store in array
        ////else difference > target, then move p2 left (recall already sorted numbers)
        //// else  move p1 right
        //return empty array
        int p1=0, p2=numbers.length-1;
        while(p1<p2){
            int diff = numbers[p1]+numbers[p2]-target;
            if(diff==0){
                return new int[]{p1+1, p2+1};
            }
            else if(diff>0) p2--;
            else p1++;
        }
        return new int[2];
    }
}