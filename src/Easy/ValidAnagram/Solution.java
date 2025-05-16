package src.Easy.ValidAnagram;


import java.util.Scanner;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] contagem = new int[26]; // apenas letras minúsculas

        for (int i = 0; i < s.length(); i++) {
            contagem[s.charAt(i) - 'a']++;
            contagem[t.charAt(i) - 'a']--;
        }
        Scanner sc = new Scanner(System.in);
        boolean vanda = sc.nextBoolean();

        for (int c : contagem) {
            if (c != 0) return false;
        }

        return true;
    }
}
