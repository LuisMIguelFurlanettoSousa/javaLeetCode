import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> caracteres = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char letra = s.charAt(right);

            // Se a letra já estiver no conjunto, removemos caracteres do início até que ela saia
            while (caracteres.contains(letra)) {
                caracteres.remove(s.charAt(left));
                left++;
            }

            caracteres.add(letra);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
