// let arr = [9, 6, 3, 4, 1, 8];
// let p = 4;
// let n = arr.length;
// let leftSide = new Array();
// let rightSide = new Array();

// for (let i = 0; i < n; i++) {
//   if (arr[i] > p) {
//     rightSide.push(arr[i]);
//   } else if (arr[i] < p) {
//     leftSide.push(arr[i]);
//   }
// }
// let result = [...leftSide,p, ...rightSide];
// console.log(result);

// here is my thinking i little bit from chatgpt and optimize it

const arr = [9, 6, 3, 1, 4, 8];
let n = arr.length;
let k = n - 1;
let j = 0;
let p = 4;
for (let i = 0; i < n; i++) {
  if (arr[j] > p) {
    let temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  if ((arr[k] = p)) {
    let temp = arr[k];
    arr[k] = arr[p];
    arr[p] = temp;
  }
}
console.log(arr);
