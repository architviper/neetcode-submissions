class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);

            // Add current character
            int freq = map.getOrDefault(c, 0) + 1;
            map.put(c, freq);

            // Max frequency inside CURRENT window
            maxFreq = Math.max(maxFreq, freq);

            // Characters we need to replace
            int replacements = (j - i + 1) - maxFreq;

            // Too many replacements
            if (replacements > k) {

                char left = s.charAt(i);

                map.put(left, map.get(left) - 1);

                i++;

                replacements = (j - i + 1) - maxFreq;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}