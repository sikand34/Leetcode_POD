import java.util.HashMap;

public class Fourteenth {
    class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //Code Starts here:
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currsum = 0;
        int n = nums.length;
        map.put(0,1);
        for(int i = 0; i<n; i++){
            currsum += nums[i];
            if(map.containsKey(currsum-goal)){
                count += map.get(currsum-goal);
            }
            map.put(currsum, map.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}
}
