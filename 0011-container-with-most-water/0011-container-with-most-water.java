class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        int l = 0; int r = height.length - 1;

        while(l < r) {
            int current = Math.min(height[l], height[r]) * (r - l);

            if(current > max) max = current;

            if(height[l] > height[r]) --r;
            else ++l;
        }

        return max;
    }
}