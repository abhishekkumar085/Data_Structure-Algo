class Stack{
    #ll //private linked list
    constructor(){
        this.#ll=new MyLinkedList();

    }

    push(element){
        this.#ll.addAtHead(element)
    }
    pop(){
        this.#ll.deleteAtHead()
    }
    top(){
        return this.#ll.head.data;
    }
}
let s=new Stack();
s.push(10);
s.push(20);

console.log(s.top())
s.pop();
console.log(s.top());