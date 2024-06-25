var Node = function (data) {
  this.data = data;
  this.next = null; // until or unless we attach this new node to a list, the next property should be null
};

class MyLinkedList {
  constructor() {
    this.head = null; // because initially everything is empty
  }
  /**
   * @param {number} index
   * @return {number}
   */
  get(index) {
    let i = 0;
    let temp = this.head;
    while (i < index && temp != null) {
      i++;
      temp = temp.next;
    }
    if (temp == null) return -1;
    return temp.data;
  }
  /**
   * @param {number} val
   * @return {void}
   */
  addAtHead(val) {
    if (this.head == null) {
      // means the ll is empty, so this node should become the head
      this.head = new Node(val);
    } else {
      // when ll is not. empty
      let n = new Node(val);
      n.next = this.head;
      this.head = n;
    }
  }
  deleteAtHead() {
    if (this.head == null) return;
    let nextHead = this.head.next;
    let nodeToBeDelete = this.head; // curr head
    this.head = nextHead;
    nodeToBeDelete.next = null; // prev head disconnected
  }
}

class Stack {
  #ll; //private linked list
  constructor() {
    this.#ll = new MyLinkedList();
  }

  push(element) {
    this.#ll.addAtHead(element);
  }
  pop() {
    this.#ll.deleteAtHead();
  }
  top() {
    return this.#ll.head.data;
  }
  isEmpty() {
    return this.#ll.head == null;
  }
}

let s = new Stack();
s.push(10);
s.push(20);

console.log(s.top());
s.pop();
console.log(s.top());
