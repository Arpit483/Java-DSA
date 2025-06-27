package Searching.BinarySearch;

public class RBS {
    public static void main(String[] args) {
    int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        System.out.println(RBsearch(arr , 0));
    }
    static public int RBsearch(int[] nums, int target) {
        int pivot =  findPivot(nums);
        if(pivot == -1){
           return BinarySearch(nums,target,0,nums.length-1);
        }
        //if pivot found
        if (nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0] ){
            return BinarySearch(nums , target , 0 , pivot-1);
        }
        return BinarySearch(nums , target , pivot+1 , nums.length-1);

    }

    static int BinarySearch(int[] arr,int target, int start,int end){
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid =  start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start &&arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid =  start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start &&arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // if elements at start , end , middle are equal then skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //what if they were pivots
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                return end-1;
                }
                end--;
            }
            //left side is sorted so pivot should
            // be in right
            else if (arr[start] > arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid]) {
                start = mid+1;
                end = mid -1;
            }
        }
        return -1;
    }
}
