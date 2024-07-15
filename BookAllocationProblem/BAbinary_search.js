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

function findPages(arr, n, m) {
  // m= number of students
  if (m > n) return -1;
  let lo = Math.max(...arr);
  let hi = arr.reduce((item, i) => item + i, 0);
  while (lo <= hi) {
    let mid = Math.ceil(lo + hi) / 2;
    let students = countStudents(arr, mid);
    if (students > m) {
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return lo;
}

let arr = [25, 46, 28, 49, 24];
let m = 4;
let n = 5;
let ans = findPages(arr, n, m);
console.log(ans);
