class Solution {
    public int getSum(int a, int b) {
        int carry  =0 , res =0;

        for (int i = 0 ; i < 32; i++) {
            int a_bit = (((1<<i) & a ) !=0 ) ? 1: 0;
            int b_bit = (((1<<i) & b ) !=0 ) ? 1: 0;
            int curr_bit = a_bit^b_bit^carry;
            carry = (a_bit  + b_bit + carry) >=2 ? 1 : 0;
            if (curr_bit !=0) 
            {
                res |= (1 << i);
            }
        }

        return res;
        
    }
}
