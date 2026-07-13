class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int  n = s.length();
        int start = 0;
        int ans = 0;

        for (int i = 0 ; i < n ; i++) {
            if(map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i))+1, start);
            }

            map.put(s.charAt(i), i);
            ans = Math.max(ans, i-start+1);
        }

        return ans;
        
    }
}
