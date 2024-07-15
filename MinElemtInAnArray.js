function findMin(arr, n) {
    if (n === 0) return undefined; // Handle empty array case
  
    let min = arr[0]; 
    for (let i = 1; i < n; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
  
    return min;
  }
  
  const arr = [3, 4];
  const n = arr.length;
  
  console.log(findMin(arr, n)); // Output: 1
  