function partition(arr, start, end) {
  const pivot = arr[start];
  let count = 0;
  for (let i = start + 1; i <= end; i++) {
    if (arr[i] <= pivot) {
      count++;
    }
  }

  // place pivot at right position
  const pivotIndex = start + count;
  [arr[pivotIndex], arr[start]] = [arr[start], arr[pivotIndex]];

  // left and right wala part smbhal lete haiiii
  let i = start,
    j = end;
  while (i < pivotIndex && j > pivotIndex) {
    // koi left part me haii aur pivot se chhota hai to
    while (arr[i] < pivot) {
      i++;
    }
    // agr koi right me jo pivot se bada haiii
    while (arr[j] > pivot) {
      j--;
    }
    if (i < pivotIndex && j > pivotIndex) {
      [arr[i++], arr[j--]] = [arr[j], arr[i]];
    }
  }
  return pivotIndex;
}

function quickSort(arr, start, end) {
  // base case
  if (start >= end) {
    return;
  }

  // partition Karenge
  const p = partition(arr, start, end);

  // left part sort kro
  quickSort(arr, start, p - 1);

  // right part sort kro
  quickSort(arr, p + 1, end);
}

// const arr = [2, 4, 1, 6, 9];
const arr = [2, 4, 1, 6, 9, 4, 3, 5, 2, 4, 6, 6, 2, 5];

const n = arr.length;

quickSort(arr, 0, n - 1);
console.log('Sorted array:', arr);
