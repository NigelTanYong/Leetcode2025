//time complexity O(n) -traverse once, space complexity O(1) - hashmap, few variables only
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>(); 
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < length; i++){
            if(i < length - 1 && map.get(s.charAt(i)) <  map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i)); //when a smaller numeral appears before a larger one (like IV for 4 or IX for 9), it implies a subtraction
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}