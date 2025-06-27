package Searching.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {15,25,35},
                {28,29,37}
        };
        System.out.println(Arrays.toString(Search(arr, 37)) );

    }
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
}
