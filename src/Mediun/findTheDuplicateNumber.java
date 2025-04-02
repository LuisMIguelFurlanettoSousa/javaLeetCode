package src.Mediun;

import java.util.Arrays;

//class Solution {
//    public int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] == nums[i - 1]) {
//                return nums[i];
//            }
//        }
//
//        return -1;
//    }
//}

class Solution {
    public int findDuplicateNumber(int[] nums) {
        int tartaruga = nums[0];
        int lebre = nums[0];

        do {
            tartaruga = nums[tartaruga];
            lebre = nums[nums[lebre]];
        } while (tartaruga != lebre);

        tartaruga = nums[0];

        while (tartaruga != lebre) {
            tartaruga = nums[tartaruga];
            lebre = nums[lebre];
        }
        return lebre;
    }
}
