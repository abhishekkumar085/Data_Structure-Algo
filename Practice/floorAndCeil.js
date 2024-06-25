const floor = (arr, x) => {
  let n = arr.length;
  let lo = 0;
  let hi = n - 1;
  let ans = -1;
  while (lo <= hi) {
    let mid = lo + (hi - lo) / 2;
    if (arr[mid] <= x) {
      ans = arr[mid];
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return ans;
};

const ceil = (arr, x) => {
  let n = arr.length;
  let lo = 0;
  let hi = n - 1;
  let ans = -1;
  while (lo <= hi) {
    let mid = lo + (hi - lo) / 2;
    if (arr[mid] >= x) {
      ans = arr[mid];
      lo=mid+1;
    }else{
        hi=mid-1;
    }
  }
  return ans;
};

let arr = [10, 20, 30, 40, 50];

let x = 55;

let result1=floor(arr,x)
let result2=ceil(arr,x);

console.log(result1,result2)




