let arr = [2, 5, 1, 7, 10];
k = 14;
let n = arr.length;

let r = 0;
let l = 0;
let sum = 0;
let max_len = 0;

while (r < n) {
  sum += arr[r];

  while (sum > k) {
    sum = sum - arr[l];
    l = l + 1;
  }

  if (sum <= k) {
    max_len = Math.max(max_len, r - l + 1);
    r = r + 1;
  }
}

console.log(max_len);


// timecomplexity---> O(N+N)
// SC--> O(1);