class Solution {
    public int missingNumber(int[] nums) {
        int output = 0;

        for(int i = 0 ; i < nums.length; i++) {
            output ^= i^nums[i];
        }

        return output^nums.length;
        
    }
}
