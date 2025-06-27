/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    //cache object
    const cache = {};
    return function(...args) {
        const key = String(args);
        if(key in cache){ // check specific properties in object exist or not
            return cache[key]; // key e.g "[2,2]"
        }
        const result = fn(...args);
        cache[key] = result;
        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */