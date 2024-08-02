/**
 * Finds the index of the row with the maximum value in a specified column.
 *
 * @param {number[][]} mat - 2D array representing the matrix.
 * @param {number} n - Number of rows in the matrix.
 * @param {number} m - Number of columns in the matrix.
 * @param {number} col - The column index to search in.
 * @return {number} - Index of the row with the maximum value in the specified column.
 */
function findMaxIndex(mat, n, m, col) {
  let maxValue = -1; // Initialize the maximum value to a very small number.
  let index = -1; // Initialize the index of the row with the maximum value.

  // Iterate over all rows to find the maximum value in the specified column.
  for (let i = 0; i < n; i++) {
    if (mat[i][col] > maxValue) {
      maxValue = mat[i][col]; // Update the maximum value.
      index = i; // Update the index of the row with the maximum value.
    }
  }
  return index; // Return the index of the row with the maximum value.
}

var findPeakGrid = function (mat) {
  let n = mat.length; // Number of rows in the matrix.
  let m = mat[0].length; // Number of columns in the matrix.
  let lo = 0; // Initialize the lower bound of the column range.
  let hi = m - 1; // Initialize the upper bound of the column range.

  // Perform binary search to find the peak element.
  while (lo <= hi) {
    let mid = Math.floor((lo + hi) / 2); // Find the middle column index.
    let maxRowIndex = findMaxIndex(mat, n, m, mid); // Find the row index with the maximum value in the middle column.
    let left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : -1; // Value in the left column (if it exists).
    let right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : -1; // Value in the right column (if it exists).

    // Check if the current middle element is a peak.
    if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
      return [maxRowIndex, mid]; // Return the coordinates of the peak element.
    } else if (mat[maxRowIndex][mid] < left) {
      hi = mid - 1; // Move the upper bound left if the peak is to the left.
    } else {
      lo = mid + 1; // Move the lower bound right if the peak is to the right.
    }
  }

  return [-1, -1]; // This is a fail-safe; ideally, this code will not be reached.
};

const mat = [[1,4],[3,2]]
console.log(findPeakGrid(mat));
