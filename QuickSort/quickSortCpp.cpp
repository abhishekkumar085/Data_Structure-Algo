// #include<iostream>
// using namespace std;

// int partition(int arr[],int start,int end){
//     int pivot=arr[start];
//     int count=0;
//     for(int i=start+1;i<=end;i++){
//         if(arr[i]<=pivot){
//             count++;
//         }
//     }

//     // place pivot at right position
//     int pivotIndex=start+count;
//     swap(arr[pivotIndex],arr[start])

//     // left and right wala part smbhal lete haiiii

// int i=start,j=end;
// while (i<pivotIndex&&j>pivotIndex){
// // koi left part me haii aur pivot se chhota hai to

// while (arr[i]<pivot){
//     i++
// }
// // agr koi right me jo pivot se bada haiii

// while (arr[j]>pivot)
// {
//     j--
// }

// if(i<pivotIndex&&j>pivotIndex){
//     swap(arr[i++],arr[j--])
// }
// return pivotIndex;

// } 
    
// }

// void quickSort(int arr[],int start,int end){
// // base case
// if(start>=end){
//     return;
// }

// // partition Karenge
// int p=partition(arr,start,end);

// // left part sort kro

// quickSort(arr,start,p-1);

// // right part sort kro
// quickSort(arr,p+1,end);
// }
// int main(){
//     int arr[5]={2,4,1,6,9};
//     int n=5;


//     quickSort(arr,0,n-1);
//     for(int i=0;i<n-1;i++){
//         cout<<arr[i]<<" ";
//     }cout<<endl;
//     return 0;

// }


#include<iostream>
using namespace std;

int partition(int arr[], int start, int end) {
    int pivot = arr[start];
    int count = 0;
    for (int i = start + 1; i <= end; i++) {
        if (arr[i] <= pivot) {
            count++;
        }
    }

    // place pivot at right position
    int pivotIndex = start + count;
    swap(arr[pivotIndex], arr[start]);

    // left and right wala part smbhal lete haiiii
    int i = start, j = end;
    while (i < pivotIndex && j > pivotIndex) {
        // koi left part me haii aur pivot se chhota hai to
        while (arr[i] < pivot) {
            i++;
        }
        // agr koi right me jo pivot se bada haiii
        while (arr[j] > pivot) {
            j--;
        }
        if (i < pivotIndex && j > pivotIndex) {
            swap(arr[i++], arr[j--]);
        }
    }
    return pivotIndex;
}

void quickSort(int arr[], int start, int end) {
    // base case
    if (start >= end) {
        return;
    }

    // partition Karenge
    int p = partition(arr, start, end);

    // left part sort kro
    quickSort(arr, start, p - 1);

    // right part sort kro
    quickSort(arr, p + 1, end);
}

int main() {
    int arr[5] = {2, 4, 1, 6, 9};
    int n = 5;

    quickSort(arr, 0, n - 1);
    for (int i = 0; i < n; i++) { // Change n-1 to n, as you want to iterate over the entire array
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}
