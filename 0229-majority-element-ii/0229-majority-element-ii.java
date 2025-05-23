import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int size = nums.length/3;
        List<Integer> list = new ArrayList(); 
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > size){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}