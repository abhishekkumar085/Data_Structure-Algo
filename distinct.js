// function distinct_values(arr) {
//   let n = arr.length;
//   arr.sort((a,b)=>a-b);
//   let distinct_cnt=1;
//   for(let i=1;i<n;i++){
//     if(arr[i]!=arr[i-1]){
//         distinct_cnt+=1;
//     }
//   }
//   return distinct_cnt;
// }

// let arr=[2,3,2,2,3,5,6]
// console.log(distinct_values(arr))

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (arr, target) {
  let n = arr.length;
  for (let i = 0; i < n; i++) {
    for (let j = n - 1; j >= 0; j--) {
      if (arr[i] + arr[j] == target) {
        return [i, j];
      }
    }
  }
};

let arr = [2, 7, 11, 15];
let target = 9;

console.log(twoSum(arr, target));
