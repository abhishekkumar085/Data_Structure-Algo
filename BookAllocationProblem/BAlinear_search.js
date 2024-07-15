/**
 *Time Complexity: O(N * (sum(arr[])-max(arr[])+1)), where N = size of the array, sum(arr[]) = sum of all array elements, max(arr[]) = maximum of all array elements.
 */

function findPages(arr, n, m) {
  // m= number of students
  if (m > n) return -1;
  let lo = Math.max(...arr);
  let hi = arr.reduce((item, i) => item + i, 0);
  for (let pages = lo; pages <= hi; pages++) {
    if (countStudents(arr, pages) == m) {
      return pages;
    }
  }
  return lo;
}

function countStudents(arr, pages) {
  let n = arr.length;
  let student = 1,
    pageCount = 0;
  for (i = 0; i < n; i++) {
    if (pageCount + arr[i] <= pages) {
      pageCount += arr[i];
    } else {
      student++;
      pageCount = arr[i];
    }
  }
  return student;
}

let arr = [25, 46, 28, 49, 24];
let m = 4;
let n = 5;
let ans = findPages(arr, n, m);
console.log(ans);
