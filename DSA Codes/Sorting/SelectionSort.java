package Sorting;

import javax.swing.*;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,2,1,3};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length-i-1;
            int max = largest(arr , 0 , last);
            swap(arr, last , max);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    private static int largest(int[] arr, int start, int last) {
        int max = start;
        for (int i = start ; i < last ; i++ ){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
