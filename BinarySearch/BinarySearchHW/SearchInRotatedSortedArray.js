/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
    let n = nums.length;
    let start = 0;
    let end = n - 1;

    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);
        if (nums[mid] == target) {
            return mid
        }
        // check if left half is sorted
        if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            // right half is sorted
            if (nums[mid] < target && target <= nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    return -1;

};
const result= [4,5,6,7,0,1,2]
const target=0;

console.log(search(result,target))