package src.Easy.RemoveDuplicatesFromSortedArray;

import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    //            [1,1,2]
    public int removeDuplicates(int[] nums) {

//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.contains(nums[i])) {
//                set.add(nums[i]);
//            }
//        }
//
//        System.out.println(set);
//
//        int i = 0;
//        for (int num : set) {
//            nums[i++] = num;
//        }
//
//        int k = set.toArray().length;
//
//        return k;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
