Date: 2025-06-30
Video Number: 20
Topic: #Sorting #arrays 
Title: **Cycle Sort - Amazon, Google, Microsoft Interview Questions**
Link:https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=21
# Notes

- When given numbers from range 1 to n apply cyclic sort

**$Index = Value -1$**

Ex : Take a Array $5,3,2,1,4$

- now in array $5,3,2,1,4$ is 5 at the correct index :LiCross:  so we swap  it with correct index ie from above formula : $index = 5-1 == 4$
- swap 5 with element at index no 4

- New array : $4,3,2,1,5$
  now we repeat the above process $index = 4-1 == 3$

- New array : $1,3,2,4,5$
  now 1 is at the correct index so we move forward to index no 1
  repeating the above steps for index 1 
  $index = 3-1 == 2$
  
  - New array : $1,3,2,4,5$
    now 3 is not  in its correct position  so we swap it 
    
  - Final Array: $1,2,3,4,5$

**Time Complexity**: $O(N)$

**PseudoCode :**
```java
static void CyclicSort(int[] arr){  
    int i = 0;  
    while(i < arr.length) {  
        int correct = arr[i] - 1;  
        //int index = value -1;  
        if(arr[i] != arr[correct] ){  
            swap(arr , i , correct );  
        }else{  
            i++;  
        }  
  
    }  
}
```
 

**Code** : [[CyclicSort.java]]

