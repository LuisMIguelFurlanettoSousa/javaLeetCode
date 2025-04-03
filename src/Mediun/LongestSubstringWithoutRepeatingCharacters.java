import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> caracteres = new HashSet<>();

        for (char letra : s) {
            caracteres.add(letra);
        }

        return caracteres.size();
    }
}