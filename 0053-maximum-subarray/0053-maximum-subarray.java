class Solution {
    public int maxSubArray(int[] nums) {
        int idx = 0;
        int len = nums.length;
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        while(idx < len) {
            sum += nums[idx];
            
            if(maxSum < sum) maxSum = sum;

            if(sum < 0) sum = 0;

            ++idx;
        }     

        return maxSum;
    }
}