import java.util.Arrays;

class Tenth{
    class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        int counts = 0;
        for (int k = 0; k < heights.length; k++) {
            if (heights[k] != expected[k]) {
                counts++;
            }
        }
        return counts;
    }
}
}