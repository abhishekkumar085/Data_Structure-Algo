// /**
//  * @param {number[]} nums
//  * @return {number}
//  */
// var singleNonDuplicate = function (nums) {
//   return nums.reduce((acc, num) => acc ^ num, 0);
// this is using XOR
// };
// let nums = [1, 1, 2, 3, 3, 4, 4, 8, 8];
// let res = singleNonDuplicate(nums);
// console.log(res);
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function (nums) {
  let lo = 0;
  let hi = nums.length - 1;

  while (lo < hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    if (mid % 2 === 1) {
      mid--;
    }
    if (nums[mid] == nums[mid + 1]) {
      lo = mid + 2;
    } else {
      hi = mid;
    }
  }
  return nums[lo];
};
let nums = [1, 1, 11, 3, 3, 5, 5, 7, 7];
let res = singleNonDuplicate(nums);
console.log(res);
