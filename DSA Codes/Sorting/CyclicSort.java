package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,4,2,1,3};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
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
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
