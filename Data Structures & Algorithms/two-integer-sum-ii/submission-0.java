class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0 ; i < numbers.length; i++) {
            if (map.containsKey(target- numbers[i])) {
               ans[0] = i < map.get(target- numbers[i]) ? i+1:  map.get(target- numbers[i]);
               ans[1] =  i < map.get(target- numbers[i]) ?   map.get(target- numbers[i]) : i+1;
            }
            map.put(numbers[i], i+1);

        }

        return ans;
        
    }
}
