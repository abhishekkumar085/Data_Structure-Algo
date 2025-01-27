// example of higher order function

function operationOnArray(arr, operation) {
  let result = [];
  for (let element of arr) {
    result.push(operation(element));
  }
  return result;
}

function double(x) {
  return x * 2;
}

let numbers = [1, 2, 3, 4];
let doubleNumbers = operationOnArray(numbers, double);
console.log(doubleNumbers);

