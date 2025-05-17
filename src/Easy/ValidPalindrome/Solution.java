package src.Easy.ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == " " || s == "") return true;

        String clear = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverseClean = new StringBuilder(clear).reverse().toString();

        System.out.println(clear + " " + reverseClean);

        if (clear.equals(reverseClean)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(" "));
    }
}