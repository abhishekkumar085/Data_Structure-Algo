// function SearchIn2d(matrix, target) {
//   let n = matrix[0].length;
//   let m = matrix.length;
//   for (let i = 0; i < m; i++) {
//     for (let j = 0; j < n; j++) {
//       if (matrix[i][j] == target) {
//         return true;
//       }
//     }
//   }
//   return false;
// }

// by binary search
/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    let m = matrix[0].length;
    console.log(m) //column
    let n = matrix.length; //row
    console.log(n)
    let lo = 0; 
    let hi = n * m - 1;

    while (lo <= hi) {
        let mid = Math.floor((lo + hi) / 2);
        let row = Math.floor(mid / m);
        let col = mid % m;
        let curr = matrix[row][col];

        if (curr === target) {
            return true;
        } else if (curr < target) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }
    }
    return false;
};


matrix = [
  [1, 4, 7, 11],
  [2, 5, 8, 12],
  [3, 6, 9, 16],
];
target = 5;

console.log(searchMatrix(matrix, target));
