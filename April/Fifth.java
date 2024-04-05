public class Fifth {
    class Solution {
        public String makeGood(String s) {
            //Code Starts Here:
            StringBuilder str = new StringBuilder();
            
            for(int i = 0; i<s.length(); i++){
                if(str.length() == 0){
                    str.append(s.charAt(i));
                } else {
                    int a = (int)s.charAt(i);
                    if(a>96){
                        if((int)str.charAt(str.length()-1) == a-32){
                            str.delete(str.length()-1, str.length());
                        } else {
                            str.append(s.charAt(i));
                        }
                    } else {
                        if((int)str.charAt(str.length()-1) == a+32){
                            str.delete(str.length()-1, str.length());
                        } else {
                            str.append(s.charAt(i));
                        }
                    }
                }
            }
            
            System.out.print(str);
            String ans = "";
            for(int i = 0; i<str.length(); i++){
                ans += str.charAt(i);
            }
            return ans;
        }
    }
}
