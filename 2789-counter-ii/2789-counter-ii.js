/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
    let curNum = init;
    return {
        increment: () => {//properties
            return ++curNum;
        },
        decrement: () => {//properties
            return --curNum;
        },
        reset: () => {//properties
            return curNum = init;
        }
    }

};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */