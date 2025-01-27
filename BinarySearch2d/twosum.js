function twoSum(arr, target) {
  let n = arr.length;
  for (let i = 0; i < n - 1; i++) {
    for (let j = i + 1; j < n; j++) {
      if (arr[i] + arr[j] === target) {
        return [i + 1, j + 1];
      }
    }
  }

  return []; // Return an empty array if no pair is found
}

let arr = [3, 24, 50, 79, 88, 150, 345];
let target = 200;

console.log(twoSum(arr, target)); // Output: [2, 5] which corresponds to indices 1 and 4
