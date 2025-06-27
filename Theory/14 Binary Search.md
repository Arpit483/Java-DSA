
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
**Matrix Could Be** : 

| 10  | 20  | 30  |
| --- | --- | --- |
| 15  | 25  | 35  |
| 28  | 29  | 37  |


**Time Complexity** : $O(N)$

**PseudoCode** :
```java
static int[] Search(int[][]arr , int target){  
     int r = 0 ;  
     int c = arr.length - 1;  
     while(r < arr.length && c >=0){  
         if(arr[r][c] == target){  
             return new int[] {r ,c};  
         }  
         if(arr[r][c] < target){  
             r++;  
         }else {  
             c--;  
         }  
     }  
     return new int[] {-1 , -1};  
}
```


## Search in a Sorted Matrix : 

array is :

| 1   | 2   | 3   | 4   |
| --- | --- | --- | --- |
| 5   | 6   | 7   | 8   |
| 9   | 10  | 11  | 12  |
| 13  | 14  | 15  | 16  |

The above example is of sorted matrix


**Time Complexity** : $O(log(N)+log(m))$

**PseudoCode** :
```java

package Searching.BinarySearch;  
  
import java.util.Arrays;  
  
public class SortedMatrix {  
    public static void main(String[] args) {  
        int [][] mat = {  
                {1,2,3,4},  
                {5,6,7,8},  
                {9,10,11,12},  
                {13,14,15,16}  
        };  
        System.out.println(Arrays.toString(search(mat , 11)));  
  
    }  
    static int[] BinarySearch(int[][] arr, int target,  int cStart , int row , int cEnd ){  
        while(cStart <= cEnd){  
            int mid = cStart + (cEnd - cStart) / 2;  
            if (arr[row][mid] ==  target){  
                return new int[] { row , mid};  
            }  
            if(arr[row][mid] > target){  
                cEnd = mid - 1;  
            }  
            if(arr[row][mid] < target){  
                cStart = mid + 1;  
            }  
        }  
        return new int[] {-1 , -1};  
    }  
  
    static int[] search(int[][] matrix , int target){  
        int rows =  matrix.length;  
        int col = matrix[0].length; //matrix may be empty  
        if(rows == 1 ){  
            return BinarySearch(matrix , target , 0 , 0 , col-1);  
        }  
        int rstart = 0 ;  
        int rend = rows -1 ;  
        int midCol = col /2 ;  
       while(rstart < (rend -1) ){  
           // more than 2 rows  
           int mid = rstart + (rend - rstart) / 2 ;  
           if(matrix[mid][midCol] == target){  
               return new int[] { mid , midCol};  
           } else if (matrix[mid][midCol] < target) {  
               rstart = mid ;  
           }else{  
               rend = mid ;  
           }  
       }  
       //now we have 2 rows  
        if(matrix[rstart][midCol] == target){  
            return new int[] {rstart , midCol};  
        }else if (matrix[rstart + 1][midCol] == target) {  
            return new int[] {rstart + 1 , midCol};  
        }  
        //now searching in 4 halves  
        else if (target <= matrix[rstart][midCol-1]) {  
            return BinarySearch(matrix , target , 0 , rstart , midCol-1);  
        }  
        else if (target >= matrix[rstart][midCol+1]  && target <= matrix[rstart][col-1] ) {  
            return BinarySearch(matrix , target , midCol+1 , rstart , col -1);  
        }  
        else if (target <= matrix[rstart+1][midCol-1]) {  
            return BinarySearch(matrix , target , 0 , rstart+1 , midCol-1);  
        }  
        else {  
            return BinarySearch(matrix , target , midCol+1 , rstart+1 , col-1);  
        }  
    }  
}
```



