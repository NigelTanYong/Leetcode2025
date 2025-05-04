class Solution {
    func firstMissingPositive(_ nums: [Int]) -> Int {
        let sortedNums = nums.sorted();
        var smallestNum = 1;
        for num in sortedNums{
            if(num == smallestNum){
                smallestNum+=1;
            }
        }
        return smallestNum;
    }
}