class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(true) {
            int m = nums[(l + r) / 2];

            if(m < nums[l]) ++l;
            if(m < nums[r]) --r;
            else if(m >= nums[r] && m >= nums[l]) {
                if(nums[r] > nums[l]) --r;
                else if(nums[r] < nums[l]) ++l;
                else break;
            } 
        }

        return nums[r];
    }
}