package src.Easy.IntersectionofTwoArrays;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNums2 = new LinkedHashSet<>();

        for (int num : nums2) {
            setNums2.add(num);
        }

        Set<Integer> setOutput = new HashSet<>();
        for (int num1 : nums1) {
            if (setNums2.contains(num1)) {
                setOutput.add(num1);
            }
        }
        int[] outPut = new int[setOutput.size()];
        int i = 0;
        for (int numSet : setOutput) {
            outPut[i++] = numSet;
        }

        return outPut;
    }
}