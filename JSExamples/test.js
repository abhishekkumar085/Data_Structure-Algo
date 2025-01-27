// function countDigits(n) {
//     // Initialize a counter variable
//     // 'cnt' to store the count of digits.
//     let cnt = 0;
//     // While loop iterates until 'n'
//     // becomes 0 (no more digits left).
//     while (n > 0) {
//         // Increment the counter
//         // for each digit encountered.
//         cnt = cnt + 1;
//         // Divide 'n' by 10 to
//         // remove the last digit.
//         n = Math.floor(n / 10);
//     }
//     // Return the
//     // count of digits.
//     return cnt;
// }

// // Main function
// function main() {
//     let N = 329823;
//     console.log("N: " + N);
//     let digits = countDigits(N);
//     console.log("Number of Digits in N: " + digits);
// }

// // Execute the main function
// main();

const array1 = [
  { id: 1, name: 'Alice' },
  { id: 2, name: 'Bob' },
];

const array2 = [
  { id: 1, age: 25, city: 'New York' },
  { id: 2, age: 30, city: 'San Francisco' },
  { id: 2, age: 30, city: 'San Francisco' },
  { id: 3, age: 30, city: 'San Francisco' },
  { id: 2, age: 30, city: 'San Francisco' },
  { id: 2, age: 30, city: 'San Francisco' },
];


const combinedArray = [];
for (let i = 0; i < Math.max(array1.length, array2.length); i++) {
  const obj1 = array1[i] || {};
  const obj2 = array2[i] || {};
  combinedArray.push({ ...obj1, ...obj2 });
}
console.log(combinedArray)

// const combineArraysUnique = (arr1, arr2) => {
//   // Create a map to hold the combined objects
//   const combinedMap = new Map();

//   // Add objects from arr1 to the map
//   arr1.forEach((item) => combinedMap.set(item.id, { ...item }));

//   // Merge objects from arr2 into the map
//   arr2.forEach((item) => {
//     if (combinedMap.has(item.id)) {
//       // Merge the existing object with the new properties
//       combinedMap.set(item.id, { ...combinedMap.get(item.id), ...item });
//     } else {
//       // If id does not exist, add new entry
//       combinedMap.set(item.id, { ...item });
//     }
//   });

//   // Convert map values to an array
//   return Array.from(combinedMap.values());
// };

// const combinedArray = combineArraysUnique(array1, array2);

// console.log(combinedArray);
