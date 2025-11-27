import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(); //각 인덱스는 길이를 나타냄

        for(int i = 0; i < nums.length; ++i) {
            int idx = Collections.binarySearch(arr, nums[i]); //있으면 -(insertion point) - 1
            if(idx < 0) idx = -(idx + 1);

            if(idx == arr.size()) arr.add(nums[i]);
            else arr.set(idx, nums[i]);
        }

        return arr.size();
    }
}