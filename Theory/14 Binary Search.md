
Date: 2025-06-24
Video Number: 14 - 
Topic: #BinarySearch #arrays #searching
Title: **Binary Search** 

# Notes

## Binary Search For Sorted Elements :

Optimised way to search...…
For Binary Search to be performed the array must be **Sorted**.

**Time Complexity** : $log(2^k$)

**Algorithm** :
1. Find the Middle Number
2. target > middle -> right
3. target < middle -> left
4. if middle == target

**Pseudocode** :
```Java
static int BinarySearch(int[] arr,int target){  
    int start = 0;  
    int end = arr.length -1;  
    while(start <= end){  
    int mid = start + (end - start) / 2;  
  
        if (arr[mid] ==  target){  
            return mid;  
        }  
        if(arr[mid] > target){  
            end = mid - 1;  
        }  
        if(arr[mid] < target){  
            start = mid + 1;  
        }  
    }  
    return -1;  
}
```

## Order Agnostic Binary Search : 

We are given a sorted array but we don't know if its sorted in ascending order or descending order.

1. First we need to find in which order is the array sorted 
	for this we need to check the **first** and **last** element of the array

Then we use the same techniques as Binary search mentioned above..... 

```java
boolean isAsc = arr[start] < arr[end];
```

