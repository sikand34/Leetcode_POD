import java.util.ArrayList;
import java.util.List;

public class TwentyFifth{
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            ArrayList<Integer> ans = new ArrayList<>();
            boolean[] arr = new boolean[nums.length+1];
            for(int i = 0; i<nums.length; i++){
                if(arr[nums[i]] == true){
                   ans.add(nums[i]);
                }
                arr[nums[i]] = true;
            }
            return ans;
        }
    }
}