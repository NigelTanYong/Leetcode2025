/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {// async function automatically return promise
    //wait for both computation is done in promise
    const [value1, value2] = await Promise.all([promise1, promise2]); //array destructuring; await pause this async funciton until task completes
    return value1 + value2; //return value resolved by both array of resolved promises (return Promise.resolve(value1 + value2))
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */