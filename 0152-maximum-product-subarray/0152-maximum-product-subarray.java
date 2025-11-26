class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; ++i) {
            min *= nums[i];
            max *= nums[i];
            
            int tmpMax = Math.max(min, Math.max(max, nums[i]));
            int tmpMin = Math.min(min, Math.min(max, nums[i]));

            max = tmpMax;
            min = tmpMin;

            if(answer < max) answer = max;
            if(answer < min) answer = min;
        }

        return answer;
    }
}