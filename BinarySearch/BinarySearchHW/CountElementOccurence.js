// function CountElementOccurence(arr, target) {
//   let lo = 0;
//   let hi = arr.length - 1;
//   let count = 0;
//   while (lo <= hi) {
//     let mid = lo + Math.floor((hi - lo) / 2);
//     if (arr[mid] == target) {
//       // Count occurrences when the target is found
//       count++;
//       // Check for additional occurrences to the left of the mid index
//       let left = mid - 1;
//       while (left >= 0 && arr[left] == target) {
//         count++;
//         left--;
//       }
//       // Check for additional occurrences to the right of the mid index
//       let right = mid + 1;
//       while (right < arr.length && arr[right] == target) {
//         count++;
//         right++;
//       }
//       return count;
//     } else if (arr[mid] < target) {
//       lo = mid + 1;
//     } else {
//       hi = mid - 1;
//     }
//   }
//   return count;
// }

// const result = [
//   1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8,
//   8, 8, 8, 9, 9, 10, 10, 10,
// ];
// const result = [
// 5,7,7,8,8,10
// ];
// let target = 8;

// console.log(CountElementOccurence(result, target));

function lowerBound(arr, x) {
  let n = arr.length;
  let start = 0;
  let end = n - 1;
  let ans = arr.length;
  while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);

    if (arr[mid] < x) {
      start = mid + 1;
    } else {
      ans = mid;
      end = mid - 1;
    }
  }
  return ans;
}
function UpperBound(arr, x) {
  let n = arr.length;
  let start = 0;
  let end = n - 1;
  let ans = arr.length;
  while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);

    if (arr[mid] <= x) {
      start = mid + 1;
    } else {
      ans = mid;
      end = mid - 1;
    }
  }
  return ans;
}
function CountElementOccurence(arr, target) {
  let lower_bound = lowerBound(arr, target);
  let upper_bound = UpperBound(arr, target);
  return upper_bound - lower_bound;
}
const result = [5, 7, 7, 8, 8, 10];
let target = 8;

console.log(CountElementOccurence(result, target));
