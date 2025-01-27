function bubbleSort(arr) {
  let n = arr.length;
  for (let i = 0; i < n; i++) {
    let is_swapped = false;
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        is_swapped = true;
      }
    }
    if (is_swapped == false) {
      return;
    }
  }
}

// const arr = [1, 2, 3, 4, 5];
const arr = [5, 6, 7, 83, 6, 7, 130];

bubbleSort(arr);
console.log('sorted by bubble sort', arr);
// Bubble Sort is a straightforward comparison-based sorting algorithm. It repeatedly iterates over the array, comparing adjacent elements and swapping them if they are in the wrong order. Each pass through the array moves the next largest unsorted element to its correct position, much like bubbles rising to the surface of a liquid. The process continues until the entire array is sorted. The algorithm's best-case performance is when the array is already sorted, in which case it can terminate early.
