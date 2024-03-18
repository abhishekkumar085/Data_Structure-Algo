/**
 * you are given an array of integer values.find the minimum cost to remove all the element of the array.
 * The cost to remove any of the elment is equal to the sum of element at that point of time in array.
 */

function findMinimumCostToRemoveAllElem(arr) {
  let n = arr.length;
  let totalSum = 0;
  for (let i = 0; i < n; i++) {
    totalSum += arr[i];
  }
  let totalCost = 0;
  arr.sort((a, b) => b - a);
  for (let j = 0; j < n; j++) {
    totalCost += totalSum;
    totalSum -= arr[j];
  }
  return totalCost;
}

const arr = [6, 4, 1];
console.log(findMinimumCostToRemoveAllElem(arr));
