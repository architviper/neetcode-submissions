class Solution {
    public int reverse(int x) {
         final int MIN = -2147483648; // -2^31
        final int MAX = 2147483647;  // 2^31 - 1
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE )  return 0;
        int n = x;
        int ans = 0;
        boolean neg = false;
        if (n < 0 ) {
            neg = true;
            n =n*(-1);
        }
        while (n != 0) {

            int r = n%10;
           
            n = n/10;

            if (ans > MAX / 10 || (ans == MAX / 10 && r > MAX % 10))
                return 0;

            ans = ans*10 + r;    
            
        }
        if (neg) return (-1)*ans;
        return ans;
    }
}
