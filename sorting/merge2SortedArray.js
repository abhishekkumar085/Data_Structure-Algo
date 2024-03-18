function mergeTwoSortedArray(nums1, m, nums2, n) {
  let i = m - 1;
  let j = n - 1;
  let k = m + n - 1;

  while (i >= 0 && j >= 0) {
    if (nums1[i] >= nums2[j]) {
      nums1[k--] = nums1[i--];
    } else {
      nums1[k--] = nums2[j--];
    }
  }

  // If there are remaining elements in nums2, copy them to nums1
  while (j >= 0) {
    nums1[k--] = nums2[j--];
  }
}
let nums1 = [1, 2, 5, 0, 0, 0]; // Array with extra space
let m = 3; // Number of elements in nums1
let nums2 = [2, 4, 6]; // Sorted array
let n = 3; // Number of elements in nums2
mergeTwoSortedArray(nums1, m, nums2, n);
console.log(nums1);
