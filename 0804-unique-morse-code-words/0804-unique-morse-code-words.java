
import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };

        HashSet<String> s = new HashSet<>();

        for (String word : words) {
            StringBuilder ans = new StringBuilder();

            for (char c : word.toCharArray()) {
                int ele = c - 'a';
                ans.append(d[ele]);
            }

            s.add(ans.toString());
        }

        return s.size();
    }
}
