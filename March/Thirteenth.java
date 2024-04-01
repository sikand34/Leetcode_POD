public class Thirteenth {
    class Solution {
        public int pivotInteger(int n) {
            //Code Starts here:
            int[] arr = new int[n+1];
            int sum = 0;
            for(int j = 0; j<=n; j++){
                sum += j;
                arr[j] = sum;
            }
            sum = 0;
            for(int j = 0; j<=n; j++){
                sum += n-j;
                if(sum == arr[n-j]){
                    return n-j;
                }
            }
            return -1;
        }
    }
}
