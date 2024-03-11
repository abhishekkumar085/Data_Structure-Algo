function sortColors(nums) {
  let left = 0; // Pointer for the next position of 0
  let right = nums.length - 1; // Pointer for the next position of 2
  let curr = 0; // Current index

  while (curr <= right) {
    if (nums[curr] === 0) {
      // If current element is 0, swap it with the element at left pointer
      [nums[curr], nums[left]] = [nums[left], nums[curr]];
      left++; // Move left pointer to the right
      curr++; // Move current pointer to the right
    } else if (nums[curr] === 2) {
      // If current element is 2, swap it with the element at right pointer
      [nums[curr], nums[right]] = [nums[right], nums[curr]];
      right--; // Move right pointer to the left
      // We don't move the current pointer here because after swapping,
      // we need to re-evaluate the current element at the current index
    } else {
      // If current element is 1, just move the current pointer to the right
      curr++;
    }
  }
}

// Example usage:
let nums = [2, 0, 2, 1, 1, 0];
sortColors(nums);
console.log(nums); // Output should be [0, 0, 1, 1, 2, 2]
