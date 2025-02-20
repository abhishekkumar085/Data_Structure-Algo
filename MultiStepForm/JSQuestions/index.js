// //Implement a retry mechanism:

// function fetchWithRetry(url, retries = 3, delay = 1000) {
//   return new Promise((resolve, reject) => {
//     function attempt(n) {
//       console.log(`Attempt ${n} for ${url}`);
//       fetch(url)
//         .then(resolve)
//         .catch((error) => {
//           if (n > 1) {
//             setTimeout(() => attempt(n - 1), delay);
//           } else {
//             reject(`Failed after ${retries} retries: ${error}`);
//           }
//         });
//     }
//     attempt(retries);
//   });
// }

// fetchWithRetry('https://jsonplaceholder.typicode.com/todo/1')
//   .then((res) => res.json()) // Convert response to JSON
//   .then((data) => console.log('Final Success:', data)) // Log JSON data
//   .catch((error) => console.error('Final Failure:', error)); // Handle failure

async function fetchWithRetryUsingAsyncAwait(url, retries = 3, delay = 1000) {
  return attemptToFetch(url, retries, delay);
}

async function attemptToFetch(url, n, delay) {
  try {
    const response = await fetch(url);
    return response;
  } catch (error) {
    if (n > 1) {
      console.log(`Retrying... ${n - 1} attempts left`);
      await new Promise((res) => setTimeout(res, delay));
      return attemptToFetch(url, n - 1, delay);
    } else {
      console.log(error);
      throw new Error('Something went wrong in the url');
    }
  }
}
fetchWithRetryUsingAsyncAwait('https://jsonplaceholder.typicode.co/todos/1')
  .then((res) => res.json())
  .then((data) => console.log('Final Success:', data))
  .catch((error) => console.error('Final Failure:', error));
