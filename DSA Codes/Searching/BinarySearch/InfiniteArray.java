package Searching.BinarySearch;
// Find the Positon of an element in a sorted array of infinite numbers.
public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(findingRange(arr , 5));
    }
    static int findingRange(int[] arr  , int target){
        //we will double the size and find the length
        //start with the box of size 2
        int start = 0;
        int end = 1;
        //condition for target to lie in range
        while(target > arr[end]){
            int newstart  = end + 1;
            //double the box value
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return BinarySearch(arr, target, start , end);
    }
    static int BinarySearch(int[] arr,int target, int start , int end){
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
}
