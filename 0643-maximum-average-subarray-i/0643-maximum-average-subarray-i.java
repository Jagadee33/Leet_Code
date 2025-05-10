class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
        }
        double windowSum = sum;
        for(int i = k; i<n;i++){
            windowSum += nums[i]-nums[i-k];
            sum = Math.max(windowSum,sum);
        }
        return sum/k;


    }
}