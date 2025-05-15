class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int small = 0;
        int res= -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > small){
                small = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}