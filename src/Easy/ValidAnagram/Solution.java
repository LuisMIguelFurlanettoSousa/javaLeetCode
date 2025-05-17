package src.Easy.ValidAnagram;


import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);

        System.out.println(sortedT + " " + sortedS);

        return Arrays.equals(sortedS, sortedT);
//
//        if (s.length() != t.length()) return false;
//
//        int[] contagem = new int[26]; // apenas letras minúsculas
//
//        for (int i = 0; i < s.length(); i++) {
//            contagem[s.charAt(i) - 'a']++;
//            contagem[t.charAt(i) - 'a']--;
//        }
//
//        for (int c : contagem) {
//            if (c != 0) return false;
//        }
//
//        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("rat", "car"));
    }
}
