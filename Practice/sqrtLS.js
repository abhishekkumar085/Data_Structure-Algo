function sqt(n){

    let ans=-1;

    for(let i=1;i<=n;i++){
        if(i*i<=n){
            ans=i;
        }else{
            break;
        }
    }
    return ans;

}

console.log(sqt(12))