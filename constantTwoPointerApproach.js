// maximum sum of any k consecutive elements
const arr = [-1, 2, 3, 3, 4, 5, -1];
let k = 4;
let n = arr.length;

let max_sum = 0;
for (let i = 0; i < k; i++) {
  max_sum += arr[i];
}
console.log(max_sum);

let curr_sum = max_sum;

for (let i = k; i < n; i++) {
  curr_sum = curr_sum - arr[i - k] + arr[i];
  if (curr_sum > max_sum) {
    max_sum = curr_sum;
  }
}

console.log('Maximum sum of', k, 'consecutive elements is:', max_sum);
