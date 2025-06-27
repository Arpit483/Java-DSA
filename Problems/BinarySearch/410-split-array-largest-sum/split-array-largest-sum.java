class Solution {
    public int splitArray(int[] nums, int k) {
     int start = 0; 
     int end = 0;
    for (int i = 0 ; i< nums.length; i++){
        start = Math.max(start , nums[i]);
        end += nums[i];
      }
      //Binary search
      while(start < end){
        int mid = start + (end - start) / 2 ;
         
         //to calculate no of pieces to divide it into wrt to the max sum
         int sum = 0;
         int pieces = 1;
         for (int num : nums){
            if (sum + num > mid){
                //cant add
                sum = num;
                pieces++;
            }else{
                sum+=num;
            }
         }
        if(pieces > k){
            start = mid + 1; 
        }else{
            end = mid;
        }
      }
      return start;
    }
}