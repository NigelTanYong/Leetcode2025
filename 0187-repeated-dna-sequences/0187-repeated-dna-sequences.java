// Time and Space complexity:O(n)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //use sliding window of size 10
        //slide the window across s
        //use set to track the 10 letter sequence
        //if 10 letter sequence seen more than once, add to the result

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i=0; i<=s.length()-10; i++){
            String subStr = s.substring(i, i+10);
            if(!seen.add(subStr)){ // if seen cannot add, means reapeated
                repeated.add(subStr); //add sequence to repeated result
            }
        }

        return new ArrayList<>(repeated);
    }
}