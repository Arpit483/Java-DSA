class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // You're in the descending part of the array
                // This may be the answer, but look to the left too
                end = mid;
            } else {
                // You're in the ascending part
                start = mid + 1;
            }
        }

        // At the end of the loop, start == end pointing to the peak
        return start;
    }
}

        
