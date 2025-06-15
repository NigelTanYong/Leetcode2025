//hashmap + modulo approach
//time complexity: O(n*m logn)
// space complexity: O(n*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String sortedStr = new String(charStr);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}