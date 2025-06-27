/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const filteredArr = [];
    for(let i=0; i<arr.length; i++){
        if(fn(arr[i], i)){
            filteredArr.push(arr[i]); ///use push here to add to end of array and also change size of array
        }
    }
    return filteredArr;
};