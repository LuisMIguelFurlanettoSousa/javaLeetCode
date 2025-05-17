package src.Easy.ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.putIfAbsent(nums[i], 1);
//            }
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//
//        for (int value : map.values()) {
//            if (value > 2) return true;
//        }
//        return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}