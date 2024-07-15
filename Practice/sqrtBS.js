function sqt(n) {
  let lo = 1;
  let hi = n;
  let ans = 1;

  while (lo <= hi) {
    let mid = lo + (hi - lo) / 2;

    if ((mid * mid <= n)) {
        ans = mid;
        lo = mid + 1;
    } else {
        hi = mid - 1;
    }
  }
  return ans;
}
console.log(sqt(48))
