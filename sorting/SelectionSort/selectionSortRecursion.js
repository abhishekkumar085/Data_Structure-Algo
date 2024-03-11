function selectionSortRecursive(arr, startIdx = 0) {
  // Base case: If startIdx is at the end of the array, return the array
  if (startIdx >= arr.length - 1) {
    return arr;
  }

  // Find the index of the minimum element starting from startIdx + 1
  let minIndex = findMinIdx(arr, startIdx + 1, startIdx);

  // If the minimum element is not at startIdx, swap them
  if (minIndex !== startIdx) {
    let temp = arr[minIndex];
    arr[minIndex] = arr[startIdx];
    arr[startIdx] = temp;
  }

  // Recursively call selectionSortRecursive with the next index
  return selectionSortRecursive(arr, startIdx + 1);

  // Helper function to find the index of the minimum element in the array starting from currentIndex
  function findMinIdx(arr, currentIdx, minIdx) {
    // Base case: If currentIdx is at the end of the array, return minIdx
    if (currentIdx >= arr.length) {
      return minIdx;
    }

    // If the element at currentIdx is smaller than the element at minIdx, update minIdx
    if (arr[currentIdx] < arr[minIdx]) {
      minIdx = currentIdx;
    }

    // Recursively call findMinIdx with the next index
    return findMinIdx(arr, currentIdx + 1, minIdx);
  }
}
