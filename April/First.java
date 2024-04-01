public class First{
    class Solution {
        public int lengthOfLastWord(String s) {
            int l = s.length()-1;
            boolean flag = false;
            int a = 0;
            while(true){
                if(l>=0){
                    if(s.charAt(l) == ' '){
                    if(flag == true){
                        return a;
                        
                    }
                    else{
                        l--;
                    }
                }
                else{
                    a++;
                    l--;
                    flag = true;
                }
                }
                else{
                    return a;
                }
                
                
            }
            
        }
    }
}