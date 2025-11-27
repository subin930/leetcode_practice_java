import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums); //정렬

        for(int i = 0; i < nums.length - 2; ++i) {
            if(i != 0 && nums[i] == nums[i - 1]) continue;

            //투포인터
            int l = i + 1; int r = nums.length - 1;
            while(l < r) {
                int sum = nums[l] + nums[r];

                if(nums[i] + sum == 0) answer.add(Arrays.asList(nums[i], nums[l], nums[r]));
                
                if(nums[i] + sum <= 0) l ++;
                else r--;
            }
        }

        return new ArrayList<>(answer);
    }
}