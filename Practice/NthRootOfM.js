// linear search

function f(i, n) {
  let ans = i ** n;
  return ans;
}

function nthRoot(n,m){

    for(let i=0;i<=m;i++){
        if(f(i,n)==m){
            return i;
        }else if(f(i,n)>m){
            break;
        }

    }
    return -1;

}

console.log(nthRoot(4,67));
