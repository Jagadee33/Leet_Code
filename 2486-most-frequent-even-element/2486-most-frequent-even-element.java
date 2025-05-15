import java.util.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i%2 == 0){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        }
        int small = 0;
        int res= -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > small || (entry.getValue() == small && entry.getKey() < res)){
                small = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}
