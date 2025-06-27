
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

## LeetCode Questions : 

### Q1. **Ceiling of a Number** : 

$int[] arr = {2,3,4,5,6,9}$    $target = 5$
**ceiling** = smallest number in array greater than or equal to target.
` Ex : ceiling(int[] arr , 7) = 9  

**PseudoCode :**

1. Implement BS
2. Now to find the element greater than equal to target.
3. When no answer found while loop breaks.. After that start becomes
   `start  = mid + 1`
   `ie: end : target : start`
   so the next big number closer to the target will become start..


### Q2. **Find The Floor of a Number** :

**Floor** : biggest number in array smaller than or equal to target.
$int[] arr = {2,3,4,5,6,9}$    $target = 5$
` Ex : ceiling(int[] arr , 7) = 6

**PseudoCode :**

1. Implement BS
2. Now to find the element smaller than equal to target.
3. When no answer found while loop breaks.. After that start becomes
   `end  = mid - 1`
   `ie: end : target : start`
   so the smallest number closer to the target will become end..


## Binary Search in 2D Array : 


A matrix is sorted in row wise and column wise manner -- every row is sorted and every column is also sorted
