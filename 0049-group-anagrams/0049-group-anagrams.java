//hashmap + modulo approach
//time complexity: O(n*m logn)
// space complexity: O(n*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); //key:sorted string, value: list<String>

        for(String str: strs){
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr); //sort string
            String sortedStringKey = new String(charStr);
            if(!map.containsKey(sortedStringKey)){ //if sorted string never appear in map before
                map.put(sortedStringKey, new ArrayList<>()); 
            }
            map.get(sortedStringKey).add(str);//get the arraylist value and add string into arraylist
        }
        return new ArrayList<>(map.values()); //return a collection of arraylist values
    }
}