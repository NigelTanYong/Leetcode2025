class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s.equals("") || words.length==0)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int wordCount = words.length;
        int charPerWordNum = words[0].length();
        int concatStringLen = wordCount * charPerWordNum;
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for(String word : words){
            wordsMap.put(word, wordsMap.getOrDefault(word,0) + 1);
        }
        for(int i=0; i<=s.length()-concatStringLen; i++){
            HashMap<String,Integer> concatMap = new HashMap<>();
            for(int j =i; j<i+concatStringLen; j+=charPerWordNum){
                String subString = s.substring(j, j+charPerWordNum);
                concatMap.put(subString, concatMap.getOrDefault(subString,0) + 1);
            }
            if(wordsMap.equals(concatMap)){
                result.add(i);
            }
        }
        return result;
    }
}