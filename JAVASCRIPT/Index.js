// A callback is function that is passed as an arguments to the another function and is executed after some asynchronous or task is completed.

//  How callback works--------

// when you make an asynchrounour request in javascript (like,timout,fetch or reading file) , you typically provide a callback function to handle the result of the operation once it's done.

// inversion of control asked to chatgpt ////////

// ## Example of Callback

// function fetchData(callback) {
//   setTimeout(() => {
//     const data = { user: 'Alice', age: 30 };
//     callback(data);
//   }, 2000);
// }

// function callback(data) {
//   console.log('DATA', data);
// }

// fetchData(callback);

// #Example of promise

function fetchData() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const data = { user: 'Alice', age: 30 };
      resolve(data);
    }, 2000);
  });
}

fetchData()
  .then((res) => {
    console.log('RESULT', res);
  })
  .catch((err) => {
    console.log(err);
  });

// #Shallow copy and deep copy

const original = {
  name: 'John',
  address: {
    city: 'New York',
    zip: '1002',
  },
};

const shallowCopy = Object.assign({}, original);

// modify city
// shallowCopy.address.city = 'Los Angels';
// shallowCopy.name = 'Tushar';

// console.log(shallowCopy.name);

// console.log('OR', original.name);

// console.log('SHALLOWCOPY ' + JSON.stringify(shallowCopy));

// console.log(original.address.city); // Output: "Los Angeles" (affected original object)
// console.log(shallowCopy.address.city); // Output: "Los Angeles" (modified copy)

const deepCopy = JSON.parse(JSON.stringify(original));

console.log('DEEP ' + JSON.stringify(deepCopy));

deepCopy.address.city = 'Barhi';

console.log(original.address.city);
console.log(deepCopy.address.city);

const token = 'Bearer enenenen';

console.log(token.split('Bearer ')[1]);

// currying:-
// # currying is a function used in functional programming that allows you to transform a function with multiple arguments into a sequence of functions,each taking only one argument at a time.

/**
 * Use Cases
 * 1.Function Composition
 * --> curry helps break down complex functions into smaller,reusable functions.
 * 2.Partial Application
 * Currying allows you to pre-fill arguments and create specialized functions.
 * --->useful when working with configuration,like setting a base APIURL
 */

// function Compositon
const multiply = (a) => (b) => a * b;

const double = multiply(2);
const triple = multiply(3);

console.log(double(5));
console.log(triple(5));

// When you need reusable variation of functions..

function a(a) {
  return function (b) {
    return a * b;
  };
}

console.log(a(3)(9));

const t = (a) => (b) => a + b;

console.log(t(3)(7));

// Partial Application

const BASE_URL = 'https://jsonplaceholder.typicode.com';

const APIURL = (BASE_URL) => (API) => `${BASE_URL}/${API}`;

const URI = APIURL(BASE_URL);
const API = URI('todos/1');

console.log(API);

// Advance filtering in Array

const filterdArray = (key) => (value) => (arr) =>
  arr.filter((item) => item[key] === value);

const filterByStatus = filterdArray('status');
const activeUsers = filterByStatus('active');

const users = [
  {
    name: 'Alice',
    status: 'active',
  },
  {
    name: 'Bob',
    status: 'inactive',
  },
];

console.log('Users', users);
