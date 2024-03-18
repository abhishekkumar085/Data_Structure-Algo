function searchMatrix(matrix, target) {
  let n = matrix.length;
  let m = matrix[0].length;

  let lo = 0;
  let hi = m * n - 1;

  while (lo <= hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    let row = Math.floor(mid / n);
    let col = mid % n;

    if (matrix[row][col] == target) {
      return true;
    } else if (matrix[row][col] < target) {
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return -1;
}
let target = 32;
let matrix = [
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 60],
];
const result = searchMatrix(matrix, target);
console.log(result);
