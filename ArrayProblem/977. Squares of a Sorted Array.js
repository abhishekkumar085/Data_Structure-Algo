let nums = [-4, -1, 0, 3, 10];

let n = nums.length;
let left = 0;
let right = n - 1;
let result = new Array(n);
let index = n - 1;

while (left <= right) {
  if (Math.abs(nums[left]) > Math.abs(nums[right])) {
    result[index] = nums[left] * nums[left];
    left++;
  } else {
    result[index] = nums[right] * nums[right];
    right--;
  }
  index--;
}

console.log(result); // Output: [0, 1, 9, 16, 100]
