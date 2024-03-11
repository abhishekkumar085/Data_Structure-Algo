let arr = [1, 3, 4, 7, 11, 16, 22];
let target = 15;
let n = arr.length;

let i = 0;
let j = n - 1;

while (i < j) {
  if (arr[i] + arr[j] == target) {
    console.log([i, j]);
    return [i + 1, j + 1];
  } else if (arr[i] + arr[j] > target) {
    j--;
  } else {
    i++;
  }
}
console.log(arr);
