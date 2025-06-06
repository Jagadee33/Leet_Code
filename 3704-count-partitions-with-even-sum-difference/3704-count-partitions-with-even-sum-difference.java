class Solution {
    public int countPartitions(int[] nums) {
        int sum =0;
        int winsum =nums[0];
        int count =0;
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
        }
        
        for(int i=1;i<nums.length;i++){
            if(Math.abs(winsum -sum)%2 == 0) count++;
            winsum += nums[i];
            sum = sum-nums[i];
        }
        return count;

    }
}