function SmallerOrEqualElements(A, B) {
  let lo = 0,
    hi = A.length - 1;
  while (lo <= hi) {
    let ans = 0;
    let mid = lo + Math.floor((hi - lo) / 2);
    if (A[mid] <= B) {
      ans = mid + 1;
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return lo;
}

let A = [1, 3, 3, 4, 4, 6];
let B = 4;
let result = SmallerOrEqualElements(A, B);
console.log(result); // Output: 5
// we can also use UpperBound
