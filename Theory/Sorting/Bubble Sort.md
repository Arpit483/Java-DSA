Date: 2025-06-27
Video Number: 17
Topic: #Sorting #arrays 
Title: **Bubble Sort Algorithm - Theory + Code**

# Notes

In Bubble sort the array is sorted in the simplest manner 
The array is divide into 2 parts ; when sorting one array contains the sorted element and one array contains the unsorted element.

**Space Complexity** : $Constant$ (no extra space is required)
**Time Complexity** : *Best Case* : $O(N)$   -> Sorted
				*Worst Case* : $O(N^2)$  -> Sorted in Opposite

Ex : 
Let The Array be  $3,1,5,4,2$ 
Now after Iteration in Bubble Sort we get
1. 3,1,5,4,2
2. 1,**3**,5,4,2
3. 1,3,**5**,4,2
4. 1,3,4,2,**5**
thus making the last element the largest element


Also know as *Sinking Sort / Exchange Sort*

### Stable and Unstable Sorting 

When The original order is maintained for sorted values the we can say that the sorted array is **Stable**.
When The original order is not maintained for sorted values the we can say that the sorted array is **Unstable**. 


**Stable** : No

**PseudoCode**:

```java
static void BubbleSort(int[]  arr){  
   boolean swapped;  
   for (int i = 0 ; i < arr.length ; i++){  
       swapped = false;  
       for (int j = 1 ; j < arr.length - i ; j++){  
           if(arr[j] < arr[j-1]){  
               int temp = arr[j];  
               arr[j] = arr[j-1];  
               arr[j-1] = temp;  
               swapped = true;  
  
           }  
       }  
       if(!swapped){  
           break;  
       }  
   }  
}
```


**Code**: 
[[BubbleSort.java]]



