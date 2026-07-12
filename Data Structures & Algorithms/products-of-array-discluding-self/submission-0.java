class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftPro = new int[n];
        int[] rightPro = new int[n];

        int[] ans = new int[n];

        int pro = 1;
        leftPro[0] =pro;

        for (int i = 1; i < n; i++) {
            leftPro[i] = nums[i-1]*leftPro[i-1];
        }

        rightPro[n-1] = 1;
        for (int i = n-2; i >=0; i--) {
            rightPro[i] = nums[i+1]*rightPro[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] =leftPro[i]*rightPro[i];
        }

        return ans;



    }
}  
