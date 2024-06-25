
// stack using array
class Stack{
    // private properties
    #arr
    constructor(){
        this.#arr=[]
    }
    push(element){
        this.#arr.push(element)
    }
    pop(){
        this.#arr.pop();
    }
    top(){
        return this.#arr[this.#arr.length-1]; //element present the last index
    }
    isEmpty(){
        return this.#arr.length==0
    }
}

let s=new Stack();
s.push(10);
s.push(20);

console.log(s.top())
s.pop();
console.log(s.top());

// time complexity O(1)