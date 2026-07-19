class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;


        while(start<=end) {
            int m = start+ (end-start)/2;

            if (nums[m] > target) {
                end--;
            }else if (nums[m] < target) {
                start++;
            }else if (nums[m] == target) {
                return m;
            }

        }

        return -1;

    }
}
