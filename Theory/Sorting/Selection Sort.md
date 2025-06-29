Date: 2025-06-29
Video Number: 18
Topic: #Sorting #arrays 
Title: **Selection Sort Algorithm - Theory + Code**
Link: https://www.youtube.com/watch?v=Nd4SCCIHFWk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=18

# Notes

Select the element and put it at its correct index

**Time Complexity** : $O(N^2)$  -> Best and Worst Case

**Stable** = No

It performs well on small list/arrays.


 Code:
 ```java
 static void SelectionSort(int[] arr){  
    for(int i = 0 ; i < arr.length ; i++){  
        int last = arr.length-i-1;  
        int max = largest(arr , 0 , last);  
        swap(arr, last , max);  
    }  
}  
  
private static void swap(int[] arr, int j, int i) {  
    int temp = arr[j];  
    arr[j] = arr[i];  
    arr[i] = temp;  
}  
  
private static int largest(int[] arr, int start, int last) {  
    int max = start;  
    for (int i = start ; i < last ; i++ ){  
        if(arr[max] < arr[i]){  
            max = i;  
        }  
    }  
    return max;  
}
```

[[SelectionSort.java]]

