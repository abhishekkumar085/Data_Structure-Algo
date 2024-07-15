function UpperBound(arr, x) {
  let n = arr.length;
  let start = 0;
  let end = n - 1;
  let ans = arr.length;
  while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);
    if (arr[mid] <= x) {
      start = mid + 1;
    } else {
      ans = mid;
      end = mid - 1;
    }
  }
  return ans;
}
let arr = [1, 2, 2, 4, 5,5];
const result = UpperBound(arr, 5);
console.log(result);
