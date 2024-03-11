/**
 * given x=6
 * which index x is present if x is present then return its index if it not present then return -1
 *
 */
let arr = [4, 1, 3, 0, -2, 6, 8, 9];

let x = 6;

let n = arr.length;

for (let i = 0; i < n; i++) {
  if (arr[i] == x) {
    console.log(i, 'djjdjd');
    break;
  } else {
    console.log(-1);
  }
}
