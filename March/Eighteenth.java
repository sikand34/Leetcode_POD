import java.util.Arrays;

public class Eighteenth {
    class Solution {
    public int findMinArrowShots(int[][] points) {
        //Code Starts here:
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int ans = 1;
        int prevEnd = points[0][1];
        for(int i = 1; i<points.length; i++){
            int currStart = points[i][0];
            if(prevEnd<currStart){
                ans++;
                prevEnd = points[i][1];
            }
        }
        return ans;
    }
}
}
