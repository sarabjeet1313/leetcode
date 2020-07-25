// find smallest in rotated sorted array -  eezy beezy


class Solution {
    public int findMin(int[] nums) {
        
        int size = nums.length;
        
        if(size == 0){
            return 0;
        }
        
        int min = nums[0];
        
        for(int i=1; i <= size - 1; i++){
            if(nums[i] < min) {
                return nums[i];
            }
        }
        return min;
    }
}
