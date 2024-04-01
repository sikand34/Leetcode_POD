public class Eleventh {
    class Solution {
        public String customSortString(String order, String s) {
            //Code Starts Here:
            int[] arr= new int[26];
            for(int i =0 ; i<s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i<order.length(); i++){
                while(arr[order.charAt(i)-'a'] > 0){
                    ans.append(order.charAt(i));
                    arr[order.charAt(i)-'a']--;
                }
            }
            for(int i = 0; i<26; i++){
                while(arr[i]>0){
                    ans.append((char)(i+'a'));
                    arr[i]--;
                }
            }
            return ans.toString();
        }
    }
}
