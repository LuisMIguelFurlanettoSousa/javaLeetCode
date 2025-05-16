package src.Mediun.maxSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = 0;

        for (int num : nums){
            cur += num;
            max = Math.max(cur, max);

            if (cur < 0)
                cur = 0;
        }

        return max;
    }
}