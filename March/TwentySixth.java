import java.util.HashSet;
    
    public class TwentySixth {
        class Solution {
        public int firstMissingPositive(int[] nums) {
            //Code starts here...
            int maxi = Integer.MIN_VALUE;
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i<nums.length; i++){
                int j = nums[i];
                if(j>maxi){
                    maxi = j;
                }
                set.add(j);
            }
            for(int i = 1; i < maxi; i++){
                if(!set.contains(i)){
                    return i;
                }
            }
            return maxi < 0 ? 1 : maxi + 1;
        }
    }
}
