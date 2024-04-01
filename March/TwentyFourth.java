public class TwentyFourth{
    class Solution {
        public int findDuplicate(int[] nums) {
            boolean[] temp = new boolean[nums.length];
            for(int i = 0; i<nums.length; i++){
                if(temp[nums[i]]){
                    return nums[i];
                }
                temp[nums[i]] = true;
            }
            return 0;
        }
    }
}