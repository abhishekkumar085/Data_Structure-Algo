var mySqrt = function(x) {
    if (x < 2) {
        return x;
    }
    let lo = 0;
    let hi = x;
    let result = 0;
    while (lo <= hi) {
        let mid = lo + Math.floor((hi - lo) / 2);
        let squared = mid * mid;

        if (squared == x) {
            return mid;
        } else if (squared < x) {
            lo = mid + 1;  // Update lo
            result = mid;
        } else {
            hi = mid - 1;  // Update hi
        }
    }
    return result;
}

let x = 8;
console.log(mySqrt(x));