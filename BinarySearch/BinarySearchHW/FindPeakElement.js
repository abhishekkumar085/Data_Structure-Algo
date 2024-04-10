// /**
//  * @param {number[]} nums
//  * @return {number}
//  */
// var findPeakElement = function(nums) {
//     let left = 0, right = nums.length-1, mid;

//     while(left < right) {
//         mid = Math.floor((right+left)/2);
//         if(nums[mid] > nums[mid+1]) right = mid;
//         else left = mid+1;
//     }
//     return left;
// };
function findPeakElement(nums) {
  if (nums.length == 1) return 0;
  let l = 0;
  let r = nums.length - 1;

  while (l <= r) {
    let mid = l + Math.floor((r - l) / 2);

    if (mid == 0 && nums[mid] > nums[mid + 1]) return mid; // leftmost element being peak

    if (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) return mid; // rightmost element being peak

    if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) return mid; // some internal element being peak

    if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
      l = mid + 1;
    } else {
      if (mid === 0 || nums[mid] > nums[mid - 1]) return mid;
      r = mid - 1;
    }
  }
}


const result=[1,2,1,3,5,6,4];

console.log(findPeakElement(result))
