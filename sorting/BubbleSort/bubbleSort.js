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
