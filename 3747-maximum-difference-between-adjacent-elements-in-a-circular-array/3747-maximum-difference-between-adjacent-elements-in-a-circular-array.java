class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int res =0;
        for(int i =0;i<n;i++){
            if(i ==0){
                res = Math.max(Math.abs(nums[i]-nums[n-1]),Math.abs(nums[i]-nums[i+1]));
            }
            else if(i == n-1){
                res = Math.max(Math.abs(nums[i]-nums[i-1]),Math.abs(nums[i]-nums[0]));
            }
            else{
                res = Math.max(Math.abs(nums[i]-nums[i-1]),Math.abs(nums[i]-nums[i+1]));
            }
            max = Math.max(res,max);

        }return max;

    }
}