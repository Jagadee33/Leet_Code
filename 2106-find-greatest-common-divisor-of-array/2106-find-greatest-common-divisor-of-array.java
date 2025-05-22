import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small  = nums[0];
        int large = nums[nums.length-1];
        while(small>0){
            int n =large%small;
            large = small;
            small = n;
        }
          
        return large;  
        }
    }