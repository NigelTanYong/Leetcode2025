/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let result = init;
    if(nums.length === 0) return init;
    for(let i=0; i<nums.length; i++){
        result = fn(result, nums[i]);
    }
    // for(const num of nums){
    //     result = fn(result, num);
    // }
    return result;
};