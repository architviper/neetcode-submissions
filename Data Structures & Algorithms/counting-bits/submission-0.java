class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0 ; i <=n; i++) {
            ans[i] = countOne(i);
        }
        return ans;
    }

    int countOne(int n) {
        int count = 0;

        for (int i = 0 ; i < 32 ; i++) {
            if( ((1 << i) & n ) !=0) {
                count++;
        }
       }
       return count;
    }
}
