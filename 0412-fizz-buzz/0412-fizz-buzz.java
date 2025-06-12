//Time & Space Complexity: O(n)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){ //start at 1 cuz nth element and not index of array
            if(i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            else if(i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }
         return result;
    }
}