// longest sub array sum<=14;

let arr = [2, 5, 1, 7, 10];
k = 14;
let n = arr.length;

// brute force;
let max_len = 0;

for (let i = 0; i < n - 1; i++) {
  let sum = 0;
  for (let j = i; j < n - 1; j++) {
    sum += arr[j];
    if (sum <= k) {
      max_len = Math.max(max_len, j - i + 1);
    } else {
      break;
    }
  }
}
console.log(max_len);

// time complexity = O(n^2)
// space complexity=o(1)



