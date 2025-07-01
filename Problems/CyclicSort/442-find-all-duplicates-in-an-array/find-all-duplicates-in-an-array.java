class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int i = 0;
       List<Integer> result = new ArrayList<>();
          while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(int index = 0 ; index < nums.length ; index++){
            if (nums[index] != index + 1) {
                result.add(nums[index]);
            }
        }

        return result;

        
        
    }
    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
        
    }
