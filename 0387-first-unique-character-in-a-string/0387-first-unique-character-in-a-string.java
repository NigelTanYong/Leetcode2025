//Hashmap approach
// Space and Time complexity: O(n)
class Solution {
    public int firstUniqChar(String s) {
        char[] sChars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        //mapping to hashmap
        for(char c:sChars){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        //iterate through the characters and check for distinct characters
        for(int i = 0; i < sChars.length; i++){
            if(map.get(sChars[i])==1){
                return i;
            }
        }
        return -1;
    }
}