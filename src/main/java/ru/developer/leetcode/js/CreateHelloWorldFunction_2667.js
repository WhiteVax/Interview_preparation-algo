/**
 * https://leetcode.com/problems/create-hello-world-function/?envType=study-plan-v2&envId=30-days-of-javascript
 */

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const greetings = 'Hello World';
    return function(...args) {
        return greetings;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */