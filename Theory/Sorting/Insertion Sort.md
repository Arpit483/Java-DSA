
Date: 2025-06-29
Video Number: 20
Topic: #Sorting #arrays 
Title: **Insertion Sort Algorithm - Theory + Code**
Link: https://www.youtube.com/watch?v=By_5-RRqVeE&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
# Notes

Here we are partially sorting the array
We sort it in parts
Here with every pass the left hand side of the array gets sorted
i.e. First the first 2 elements get sorted the first 3 and so on...….

**Time Complexity** : $O(N^2)$  -> Worst Case
				$O(N)$  -> Best Case


**Use Case** :  
- It's adaptive(Number of swaps reduced as compared to Bubble Sort)
- Stable
- Works for smaller values of N
- Used when array is partially sorted 
- Used in Hybrid Sorting Algorithm

**PseudoCode** : 

```java
static void InsertionSort(int[] arr){  
    for (int i = 0; i < arr.length-1 ; i++) {  
        for (int j = i + 1 ; j > 0 ; j--) {  
            if(arr[j] < arr[j-1]){  
                swap(arr , j , j-1 );  
            }else {  
                break;  
            }  
        }  
  
    }  
}
```

**Code** : [[InsertionSort.java]]
