package Searching.LinearSearch;
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
    int[][] arr = {{2,3,5},{12,56,78}};
      //  System.out.println();
        int[] ans = search(arr , 5);
        System.out.println(Arrays.toString(ans));
        int max = max(arr);
        System.out.println(max);
    }

    static int[] search(int[][] arr , int target){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j=0; j< arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
       int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            for(int j=0; j< arr[i].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
