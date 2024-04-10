var findMin = function (nums) {
  let lo = 0;
  let n = nums.length - 1;
  let hi = n;

  while (lo < hi) {
    let mid = lo + Math.floor((hi - lo) / 2);

    if (nums[mid] == nums[hi]) {
      hi--;
    } else if (nums[mid] < nums[hi]) {
      hi = mid;
    } else {
      lo = mid + 1;
    }
  }
  // When the loop terminates, lo will point to the minimum element
  return nums[lo];
};

const nums=[4,5,6,7,0,1,2]

console.log(findMin(nums))