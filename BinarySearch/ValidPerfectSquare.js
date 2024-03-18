function isPerfectSquare(num) {
  let hi = num;
  let lo = 1;
  let ans = false;

  while (lo <= hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    let squared = mid * mid;

    if (squared == num) {
      ans = true;
      break;
    } else if (squared < num) {
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }
  return ans;
}

let result = isPerfectSquare(14);
console.log(result);
