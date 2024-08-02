/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var rowAndMaximumOnes = function (mat, n, m) {
  let cnt_max = 0;
  let index = -1;

  for (let i = 0; i < n; i++) {
      let cnt_ones = 0;
    for (let j = 0; j < m; j++) {
      cnt_ones += mat[i][j];
    }
    if (cnt_ones > cnt_max) {
      cnt_max = cnt_ones;
      index = i;
    }
  }
  return index;
};

const mat = [
  [1, 1, 1],
  [0, 0, 1],
  [0, 0, 0],
];
let n = 3,
  m = 3;

const result = rowAndMaximumOnes(mat, n, m);

console.log(result);
