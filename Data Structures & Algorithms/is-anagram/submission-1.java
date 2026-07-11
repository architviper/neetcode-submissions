class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n !=m) return false;

        int[] reqArr = new int[26];

        for (int i = 0 ; i < n ; i++) {
            reqArr[s.charAt(i)-'a']++;
            reqArr[t.charAt(i)-'a']--;
        }


        for (int i = 0 ; i < 26 ; i++) {
            if(reqArr[i] != 0) return false;
        }

        return true;

    }
}
