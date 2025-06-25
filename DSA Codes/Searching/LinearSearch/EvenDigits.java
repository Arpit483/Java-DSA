package Searching.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    private static boolean even(int num) {
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
