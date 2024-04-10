/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function (nums1, nums2) {
  let n = nums1.length;
  let m = nums2.length;
  let result = [];
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < m; j++) {
      if (nums1[i] == nums2[j]) {
        result.push(nums1[i]);
        break;
      }
    }
  }
  return check_duplicate_in_array(result);
};
let check_duplicate_in_array = (result) => {
  return Array.from(new Set(result));
};

let nums1 = [1, 2, 2, 1],
  nums2 = [2, 2];
console.log(intersection(nums1, nums2));
