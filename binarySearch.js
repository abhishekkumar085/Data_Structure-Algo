function binarySearch2(arr, x) {
  let n = arr.length;
  let lo = 0;
  let hi = n - 1;

  while (lo <= hi) {
    mid = lo + Math.floor((hi - lo) / 2);
    if (arr[mid] == x) {
      return mid[lo];
    }
  }
}
