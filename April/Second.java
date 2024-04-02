import java.util.HashMap;

public class Second {
    class Solution {
    public boolean isIsomorphic(String s, String t) {
        Boolean flag = true;
        int n = s.length();
        int n2 = t.length();
        if(n != n2){
            System.out.println("NO");
            return false;
        }
        else{
            HashMap<Character, Character> map = new HashMap<>();
            for(int i = 0; i<n; i++){
                char c = s.charAt(i);
                char d = t.charAt(i);
                if(!map.containsKey(c)){
                    if(map.containsValue(d)) return false;
                    map.put(c,d);
                }
                else {
                    char a = map.get(c);
                    if(a!=d) return false;
                }
            }    
        }
        return true;
    }
}
}
