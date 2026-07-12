class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();

        int n = charArray.length;

        int start = 0;
        int end = n-1;

        while(start < end) {
            if (!Character.isLetterOrDigit(charArray[start]) ) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(charArray[end]) ) {
                end--;
                continue;
            }
            if(charArray[start] != charArray[end])
            return false;

            start++;
            end--;

        }

        return true;

        
    }
}
