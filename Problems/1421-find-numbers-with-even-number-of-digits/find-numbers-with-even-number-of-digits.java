class Solution {
   public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i=0;i<nums.length;i++) {
            //  int count = 0;
            //  while(nums > 0) {
            //      num = num/10;
            //      count++;
            //  }
            if(((int)Math.log10(nums[i]) + 1)%2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}