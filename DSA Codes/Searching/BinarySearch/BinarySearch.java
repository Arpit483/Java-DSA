package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(BinarySearch(arr,1));
    }
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
}
