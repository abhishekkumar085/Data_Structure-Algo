let arr = [-1, 0, 1, 2, -1, 4];
let n = arr.length;
let c = 0;
console.log('c', c);
let i = c + 1;
console.log('i', i);
let j = n - 1;
console.log('j', j);
let target = -arr[c]; // corrected target calculation
console.log('target', target);

let result = arr.sort((a, b) => a - b);
console.log('result', result);

for (let c = 0; c < n - 3; c++) {
  // changed loop condition to n - 2
  if (c == 0 || arr[c] != arr[c - 1]) {
    i = c + 1;
    j = n - 1;
    while (i < j) {
      if (arr[i] + arr[j] > target) {
        j--;
      } else if (arr[i] + arr[j] < target) {
        i++;
      } else {
        console.log('Result:', [arr[c], arr[i], arr[j]]);
        i++;
        j--;
        while (i < j && arr[i] == arr[i - 1]) i++; // skip duplicates for i
        while (i < j && arr[j] == arr[j + 1]) j--; // skip duplicates for j
      }
    }
  }
}
