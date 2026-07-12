class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max =0;
        int start = 0 ; 
        int end = n-1;

        while (start< end) {
            int maxH = Math.min(heights[start], heights[end]);
            int width = end-start;
            max = Math.max(maxH*width, max);

            if (heights[start] <= heights[end]) {
                start++;
            }else {
                end--;
            }
        }
        return max;
    }
}
