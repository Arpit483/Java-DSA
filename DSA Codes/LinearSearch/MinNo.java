package LinearSearch;

public class MinNo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,0};
        min(arr);

    }
    static int min(int[] arr){
        if(arr.length!=0){
            int ans = arr[0];
            for (int i = 0; i <arr.length; i++){
                if (arr[i]< ans) {
                    ans = arr[i];
                }
            }
            System.out.println(ans);
        }
        return -1;
    } //done
    
}
