class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length;
        int count = 1;
        int longest = 0;

        for (int i = 0 ; i < n; i++) {
            if (!set.contains(nums[i]-1)) {
                //int j = i;
                int last = nums[i];
                while (set.contains(last+1)){
                    count++;
                    last++;
                    //j++;
                }
            }
            longest = Math.max(longest, count);
            count =1;

        }
        return longest;
        
    }
}
