let arr = [1, 3, 9, 11, 16, 18, 22, 27];
let x = 3;
let n = arr.length;
let start = 0;
let end = n - 1;
console.log(end, n);

while (start <= end) {
    let mid = start + Math.floor((end - start) / 2);
  if (arr[mid] == x) {
    console.log('Element found at index:', mid);
    console.log('Element:', arr[mid]);
    return mid;
  } else if (arr[mid] < x) {
    start = mid + 1;
  } else {
    end = mid - 1;
  }
}

console.log('Element not found');
return -1;
