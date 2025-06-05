class Solution {
    public int smallestIndex(int[] nums) {
        int index = -1;
        int sum =0;
        for(int i =0;i<nums.length;i++){
            while(nums[i] != 0){
                int dig = nums[i]%10;
                sum += dig;
                nums[i] = nums[i] / 10;
            }
            if(sum == i){
                return i;
            }sum =0;
        }
        return index;
    }
}