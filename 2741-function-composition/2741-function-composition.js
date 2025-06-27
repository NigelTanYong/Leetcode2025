//backward loop approach for O(1) space
/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    if (functions.length === 0) return (x) => {return x;};
    return function(x) {
        let result = x;
        //notice that the computation starts from the last function, so we calculate by looping backward
        for(let i=functions.length-1; i>=0; i--){
            result = functions[i](result);
        }
        return result;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */