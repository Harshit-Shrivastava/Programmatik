import java.util.*;

public class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums = new int[]{1,2,3,4,5,1,6,1};
        int k = 2;
        Solution test = new Solution();
        System.out.println(test.containsNearbyDuplicate(nums, k));
    }
}
