class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int i = 0 ;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
           for(int index  = 0 ; index < nums.length ; index++){
                if(nums [index]!= index + 1 ){
                    result.add(index + 1 );
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
