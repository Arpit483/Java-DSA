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
