public class Fifteenth {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            //Code Starts here:
            int[] products = new int[nums.length];
            int prd = 1;
            for(int i =0 ; i<nums.length; i++){
                products[i] = prd;
                prd = prd*nums[i];
            }
            prd = 1;
            for(int i = nums.length-1; i>=0; i--){
                products[i] = products[i]*prd;
                prd = prd*nums[i];
            }
            return products;
        }
    }
}
