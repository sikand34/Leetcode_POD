import java.util.ArrayList;
import java.util.HashSet;

public class Tenth {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Code Starts here:
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                arr.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
}
