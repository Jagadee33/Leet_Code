class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap< Integer,Integer> newmap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int k = target - nums[i];
            if(newmap.containsKey(k)){
                return new int[]{newmap.get(k), i};
            }
            newmap.put(nums[i], i);
        }
        return new int[]{};
    }
}