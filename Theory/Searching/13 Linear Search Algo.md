Date: 2025-06-24
Video Number: 13
Topic: #LinearSearch #arrays
Title: **Linear Search Algorithm - Theory + Code + Questions**

# Notes

If we have a array

```
arr = [1,2,3,5,6]
```

and the question is to find 2 then we iterate through every element in the array

**PsuedoCode** :
```
 static int LinearSearch(int[] arr, int x ){
   if (arr.length == 0 ){
            return -1; // Array is empty
        }
	for (int i =0 ; i <arr.length; i++) {
			if (arr[i] == x) {
			return i; // Element found
			}
		}        
	return -1; // Element not found
}
```

