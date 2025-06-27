class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
        int mid = start + (end - start) / 2;
        if(arr[mid] > arr[mid+1]){
            //descending
            end  = mid ; 
        }else{
            //ascending
            start = mid + 1;
            }
        }
    //so when we get both start and end at the same place we could conclude 
    //that we have got the largest element possoble
    return start;
    }
    
   
}