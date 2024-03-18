/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function (n) {
    let lo = 1, hi = n;
    while (lo <= n) {
        let mid = lo + Math.floor((hi - lo) / 2);
        let guessNum = guess(mid);
        if (guessNum == 0) {
            return mid;
        } else if (guessNum == 1) {
            lo = mid + 1
        } else if (guessNum == -1) {
            hi = mid - 1;
        }
    }


};
let n=6
