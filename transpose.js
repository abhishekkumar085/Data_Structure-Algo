function Swap(x,y){
    let temp=x;
    x=y;
    y=temp;

}

function transpose(mat){
    let n=mat.length; //row
    let m=mat[0].length; //col

    for(let i=0;i<n;i++){
        for(let j=i;j<m;j++){
          let temp=mat[i][j];
          mat[i][j]=mat[j][i];
          mat[j][i]=temp

        }
    }
    
}
// console.log(Swap(4,9))

const mat = [
    [1,2,3],
    [5,6,7],
    [9,10,11]
]
transpose(mat)
console.log(mat)